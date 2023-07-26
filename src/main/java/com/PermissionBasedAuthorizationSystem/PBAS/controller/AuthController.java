package com.PermissionBasedAuthorizationSystem.PBAS.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PermissionBasedAuthorizationSystem.PBAS.payload.LoginDto;
import com.PermissionBasedAuthorizationSystem.PBAS.payload.RegisterDto;
import com.PermissionBasedAuthorizationSystem.PBAS.service.AuthService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    
    private AuthService authService;

    //build login REST API
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto){
         String response=authService.login(loginDto);
         return ResponseEntity.ok(response);
    }

    //build signup REST API
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterDto registerDto){
         String response=authService.register(registerDto);
         return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
}
