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

	public void salvar(Veiculos veiculos) {
		veiculosRepository.salvar(veiculos);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<Veiculos> listarVeiculos() {
		return veiculosRepository.lista();
	}

	public void excluir(Integer id) {
		veiculosRepository.Excluir(id);
	}

	public Veiculos buscarVeiculo(Integer id) {
		return veiculosRepository.busca(id);
	}

}
