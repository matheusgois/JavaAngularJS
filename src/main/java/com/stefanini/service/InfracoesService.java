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
	
	
	public void salvar(Infracoes infracoes) {
		infracoesRepository.salvar(infracoes);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<Infracoes> listarInfracoes() {
		return infracoesRepository.lista();
	}

	
	public void excluir(Integer id) {
		infracoesRepository.Excluir(id);
	}
	
	public void buscarInfracao(Integer id){
		infracoesRepository.busca(id);
	}
	
}
