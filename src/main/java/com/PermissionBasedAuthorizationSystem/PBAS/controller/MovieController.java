package com.PermissionBasedAuthorizationSystem.PBAS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PermissionBasedAuthorizationSystem.PBAS.Dto.MovieDto;
import com.PermissionBasedAuthorizationSystem.PBAS.service.MovieService;

@RestController
@RequestMapping("/apimovies")
public class MovieController {

    @Autowired
    private MovieService movieService;
    
    @GetMapping("/all")
    public List<MovieDto> getAllMovies(){
        return movieService.getAllMovies();
    }
 
     @GetMapping("/movieByName/{name}")
    public MovieDto getMoviesByName(@PathVariable String name){
        return movieService.getMovieByName(name);
    }
 
    @GetMapping("/movieByNameContaining/{name}")
    public List<MovieDto> getMoviesByNameConatining(@PathVariable String name){
          return movieService.getMoviesByNameConatining(name);
    }
}