package com.PermissionBasedAuthorizationSystem.PBAS.service;

import com.PermissionBasedAuthorizationSystem.PBAS.payload.LoginDto;
import com.PermissionBasedAuthorizationSystem.PBAS.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
