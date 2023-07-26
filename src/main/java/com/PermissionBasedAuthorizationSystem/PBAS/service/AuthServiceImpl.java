package com.PermissionBasedAuthorizationSystem.PBAS.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.PermissionBasedAuthorizationSystem.PBAS.entity.Role;
import com.PermissionBasedAuthorizationSystem.PBAS.entity.User;
import com.PermissionBasedAuthorizationSystem.PBAS.payload.LoginDto;
import com.PermissionBasedAuthorizationSystem.PBAS.payload.RegisterDto;
import com.PermissionBasedAuthorizationSystem.PBAS.repository.RoleRepository;
import com.PermissionBasedAuthorizationSystem.PBAS.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService{

    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    @Override
    public String login(LoginDto loginDto) {
        // TODO Auto-generated method stub
        Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsernameOrEmail(), loginDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return "User logged in successfully";
    }

    @Override
    public String register(RegisterDto registerDto) {
        //check for username exists in database
   /*     if(userRepository.existsByUsername(registerDto.getUsername())){
            throw new PBASAPIException(HttpStatus.BAD_REQUEST,"Username already exists!");
        }
        //check for email exists in database
        if(userRepository.existsByEmail(registerDto.getEmail())){
            throw new PBASAPIException(HttpStatus.BAD_REQUEST,"Email already exists");
        }*/
        User user=new User();
        user.setName(registerDto.getName());
        user.setUsername(registerDto.getUsername());
        user.setEmail(registerDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        
        Set<Role> roles=new HashSet<>();
        Role userRole=roleRepository.findByName("USER_ROLE").get();
        roles.add(userRole);
        user.setRoles(roles);

        userRepository.save(user);

        return "User registered successfully";
    }
    
}
