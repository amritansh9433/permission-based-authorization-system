package com.PermissionBasedAuthorizationSystem.PBAS.Dto;

import lombok.Data;

@Data
public class OneShowDto {
    private Long show_id;
    private String show_name;
    private Double priceOfTicket;
    private String moviename;
    private String theatrename;
    private String theatrecity;
}
