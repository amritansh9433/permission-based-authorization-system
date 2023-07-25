package com.PermissionBasedAuthorizationSystem.PBAS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PermissionBasedAuthorizationSystem.PBAS.entity.Screen;

@Repository
public interface ScreenRepository extends JpaRepository<Screen,Long>{
    
}