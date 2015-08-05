package br.com.vagner.rotas.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.vagner.rotas.model.MalhaLogistica;

public interface MalhaLogisticaService {

	List<MalhaLogistica> getAllMalhaLogistica();

	MalhaLogistica getMalhaLogistica(long id);

	MalhaLogistica insertMalhaLogistica(MalhaLogistica malhaLogistica);

	void deleteMalhaLogistica(long id);

	List<MalhaLogistica> findByPontoOrigem(String pontoOrigem);

	List<MalhaLogistica> findByPontoDestino(String pontoDestino);
	
	Map<String, List<MalhaLogistica>> findMalhasByPontosOrigem(Set<String> pontosOrigem);
	
}
