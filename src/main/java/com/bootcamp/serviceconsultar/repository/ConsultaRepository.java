package com.bootcamp.serviceconsultar.repository;

import com.bootcamp.serviceconsultar.entity.Consulta;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ConsultaRepository extends ReactiveMongoRepository<Consulta, String> {
}
