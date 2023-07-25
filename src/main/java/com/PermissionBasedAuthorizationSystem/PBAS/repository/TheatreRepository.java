package com.PermissionBasedAuthorizationSystem.PBAS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PermissionBasedAuthorizationSystem.PBAS.entity.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre,Long>{
    
}