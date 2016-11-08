package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Propietario;
import com.stefanini.repository.AgenteRepository;

@Stateless
public class AgenteService {
	
	@Inject
	private AgenteRepository agenteRepository;
	
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Propietario agente){
    	agenteRepository.incluirAgente(agente);
    }

}
