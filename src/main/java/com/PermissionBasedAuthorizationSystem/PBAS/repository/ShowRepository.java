package com.PermissionBasedAuthorizationSystem.PBAS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PermissionBasedAuthorizationSystem.PBAS.entity.OneShow;

@Repository
public interface ShowRepository extends JpaRepository<OneShow,Long>{
    
}
