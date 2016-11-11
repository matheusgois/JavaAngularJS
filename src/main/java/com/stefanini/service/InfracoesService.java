package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Infracoes;
import com.stefanini.repository.InfracoesRepository;

@Stateless
public class InfracoesService {

	@Inject
	private InfracoesRepository infracoesRepository;
	
	
	public void incluir(Infracoes infracoes) {
		infracoesRepository.incluirInfracoes(infracoes);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<Infracoes> listarInfracoes() {
		
		List<Infracoes> lista = infracoesRepository.lista();
		return lista;
	}

	public void salva(Infracoes a) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
