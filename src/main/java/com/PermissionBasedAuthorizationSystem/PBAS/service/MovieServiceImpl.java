package com.PermissionBasedAuthorizationSystem.PBAS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PermissionBasedAuthorizationSystem.PBAS.Dto.MovieDto;
import com.PermissionBasedAuthorizationSystem.PBAS.entity.Movie;
import com.PermissionBasedAuthorizationSystem.PBAS.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
    
    @Autowired
    public MovieRepository movieRepository;

    public List<MovieDto> getAllMovies(){
        List<Movie> allMovies=movieRepository.findAll();
        List<MovieDto> allMoviesDto=new ArrayList<>();
        for(Movie m:allMovies){
            MovieDto movieDTO=m.toDTO();
            allMoviesDto.add(movieDTO);
        }
        return allMoviesDto;
    }

    public MovieDto getMovieByName(String name){
        Movie m=movieRepository.findByName(name);
        return m.toDTO();
    }

    public List<MovieDto> getMoviesByNameConatining(String name) {
        List<Movie> allMovies=movieRepository.findByNameContaining(name);
        List<MovieDto> allMoviesDto=new ArrayList<>();
        for(Movie m:allMovies){
            MovieDto movieDTO=m.toDTO();
            allMoviesDto.add(movieDTO);
        }
        return allMoviesDto;
    }
}
