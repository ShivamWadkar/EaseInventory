package com.inventory.easeinventory.config;

import com.inventory.easeinventory.entity.Admin;
import com.inventory.easeinventory.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EaseInventoryAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Custom authentication provider
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String userName = authentication.getName();
        String pwd = authentication.getCredentials().toString();
        Admin admin = adminRepository.findByEmailId(userName);
        if(admin != null){
            if(passwordEncoder.matches(pwd,admin.getPassword())){
                List<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority(admin.getRole()));
                return new UsernamePasswordAuthenticationToken(userName,pwd,authorities);
            }else{
                throw new BadCredentialsException("Invalid Password");
            }
        }else{
            throw new BadCredentialsException("No user registered with this details");
        }

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
