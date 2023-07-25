package com.PermissionBasedAuthorizationSystem.PBAS.Dto;

import lombok.Data;

@Data
public class MovieDto {
    private Long movie_id;
    private String name;
    private int durationInMins;
}
