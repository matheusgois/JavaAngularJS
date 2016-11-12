package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.repository.AgenteRepository;

@Stateless
public class AgenteService {

	@Inject
	private AgenteRepository agenteRepository;

	
	public void salva(Agente agente) {
		agenteRepository.salva(agente);
	}
	
	public Agente buscarAgente(Integer id){
		return agenteRepository.busca(id);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<Agente> listarAgente() {
		return agenteRepository.lista();
	}
	
	public void excluir(Integer i){
		agenteRepository.Excluir(i);
	}
	
	
	

}
