package br.com.vagner.rotas.service;

import java.util.List;
import java.util.Map;

import br.com.vagner.rotas.dto.Trajeto;
import br.com.vagner.rotas.model.MalhaLogistica;
import br.com.vagner.rotas.model.Rota;
import br.com.vagner.rotas.model.Rotas;

public interface TrajetoService {

	Trajeto buscarMelhor(Trajeto trajeto);
	
	String retornarNomesRota(List<MalhaLogistica> malhas);
	
	Trajeto preencherTrajeto(Rota rota, Trajeto pesquisa);
	
	Rotas criarNovasRotas(Trajeto pesquisa );
	
	Rotas addMalhas(Trajeto pesquisa, Rotas rotas);
	
	Map<String, List<MalhaLogistica>>  buscarNovasMalhas( Rota rota);
	

}
