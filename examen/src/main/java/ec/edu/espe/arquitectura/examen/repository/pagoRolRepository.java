package ec.edu.espe.arquitectura.examen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.examen.model.pagoRol;

@Repository
public interface pagoRolRepository extends MongoRepository<pagoRol, String> {
}