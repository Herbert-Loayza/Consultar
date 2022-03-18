package com.bootcamp.serviceconsultar.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Consulta {

    @Id
    private String idConsulta;
}
