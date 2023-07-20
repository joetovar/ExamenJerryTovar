package ec.edu.espe.arquitectura.examen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.examen.model

public interface EmpresaRepository extends MongoRepository<Empresa, String> {
    
}
