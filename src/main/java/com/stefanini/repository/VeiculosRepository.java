package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Agente;
import com.stefanini.model.Veiculos;

public class VeiculosRepository {
	
	@Inject
	private EntityManager manager;

	public void incluirAgente(Veiculos veiculos) {
		this.manager.persist(veiculos);
	}

	public void altera(Veiculos veiculos) {
		this.manager.merge(veiculos);
	}

	public Agente busca(Integer id) {
		return this.manager.find(Agente.class, id);
	}

	public List<Veiculos> lista() {
		return this.manager.createQuery("select a from Veiculos a", Veiculos.class)
				.getResultList();
	}


}
