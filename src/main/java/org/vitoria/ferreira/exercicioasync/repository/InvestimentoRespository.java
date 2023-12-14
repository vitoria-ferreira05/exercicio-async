package org.vitoria.ferreira.exercicioasync.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.vitoria.ferreira.exercicioasync.model.Investimento;
@Repository
public interface InvestimentoRespository extends MongoRepository<Investimento, String> {
}
