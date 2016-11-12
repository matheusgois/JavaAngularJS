package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Veiculos;

public class VeiculosRepository {
	
	@Inject
	private EntityManager manager;

	public void salvar(Veiculos veiculos) {
		if (veiculos.getIdVeiculo() != null) {
			this.manager.merge(veiculos);
		} else {
			this.manager.persist(veiculos);
		}
	}

	public Veiculos busca(Integer id) {
		return this.manager.find(Veiculos.class, id);
	}

	public List<Veiculos> lista() {
		return this.manager.createQuery("select v from Veiculos v join fetch v.infracoes", Veiculos.class)
				.getResultList();
	}

	public void Excluir(Integer id) {
		Veiculos veiculos = busca(id);
		manager.remove(veiculos);
	}

}
