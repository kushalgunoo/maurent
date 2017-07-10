package com.userAuthentication.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.userAuthentication.model.User;
import com.userAuthentication.model.UserType;
import com.userAuthentication.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService{
   
	@Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        List<UserType> userTypes =  new java.util.ArrayList<UserType>();
        userTypes.add(user.getRoles());
        
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (UserType userType : userTypes){
            grantedAuthorities.add(new SimpleGrantedAuthority(userType.getName()));
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
