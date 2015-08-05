package br.com.vagner.rotas.repository;


import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vagner.rotas.model.MalhaLogistica;

@Repository
public interface MalhaLogisticaRepository extends CrudRepository<MalhaLogistica, Long>{
	
	public List<MalhaLogistica> findByPontoOrigem(String pontoOrigem);
	
	public List<MalhaLogistica> findByPontoDestino(String pontoDestino);
	
	public List<MalhaLogistica> findByPontoOrigemIn(Set<String> pontosOrigem);
	
	
}
