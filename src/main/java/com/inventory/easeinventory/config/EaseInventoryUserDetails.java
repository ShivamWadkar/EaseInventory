package com.inventory.easeinventory.config;

import com.inventory.easeinventory.entity.Admin;
import com.inventory.easeinventory.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EaseInventoryUserDetails implements UserDetailsService {
    @Autowired
    private AdminRepository adminRepository;

    // Authentication is provided by DAOAuthenticationProvider
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String userName,password = null;
        List<GrantedAuthority> authorities = null;
        Admin admin = adminRepository.findByEmailId(username);
        if(admin == null){
            throw new UsernameNotFoundException("User details not found for the user:"+username);
        }else{
            userName = admin.getEmailId();
            password = admin.getPassword();
            authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(admin.getRole()));
        }
        return new User(userName,password,authorities);
    }
}
