package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Propietario;

public class AgenteRepository {
	
	@Inject
	private EntityManager manager;

	public void incluirAgente(Propietario agente) {
		this.manager.persist(agente);
	}

	public void altera(Propietario agente) {
		this.manager.merge(agente);
	}

	public Propietario busca(Integer id) {
		return this.manager.find(Propietario.class, id);
	}

	public List<Propietario> lista() {
		return this.manager.createQuery("select c from denuncia c", Propietario.class)
				.getResultList();
	}

}
