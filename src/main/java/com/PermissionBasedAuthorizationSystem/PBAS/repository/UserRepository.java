package com.PermissionBasedAuthorizationSystem.PBAS.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PermissionBasedAuthorizationSystem.PBAS.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
