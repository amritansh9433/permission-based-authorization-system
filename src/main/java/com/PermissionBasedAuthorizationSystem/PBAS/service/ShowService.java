package com.PermissionBasedAuthorizationSystem.PBAS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PermissionBasedAuthorizationSystem.PBAS.Dto.OneShowDto;

@Service
public interface ShowService{
    public List<OneShowDto> getAllShows();
    public List<OneShowDto> getAllShowsOfMovie(String movieName);
    public List<OneShowDto> getAllShowsInCity(String city);
}
