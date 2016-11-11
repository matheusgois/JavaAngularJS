package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Veiculos;
import com.stefanini.repository.VeiculosRepository;

@Stateless
public class VeiculosService {
	
	@Inject
	private VeiculosRepository veiculosRepository;

	public void incluir(Veiculos veiculos) {
		veiculosRepository.incluirAgente(veiculos);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<Veiculos> listarVeiculos() {
		return veiculosRepository.lista();
	}

	public void salva(Veiculos a) {
		// TODO Auto-generated method stub
		
	}


}
