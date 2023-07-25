package com.PermissionBasedAuthorizationSystem.PBAS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PermissionBasedAuthorizationSystem.PBAS.Dto.MovieDto;

@Service
public interface MovieService{
    public List<MovieDto> getAllMovies();

    public MovieDto getMovieByName(String name);

    public List<MovieDto> getMoviesByNameConatining(String name);
}
