package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Propietario;

public class PropietarioRepository {
	@Inject
	private EntityManager manager;

	public void incluirAgente(Propietario propietario) {
		this.manager.persist(propietario);
	}

	public void altera(Propietario agente) {
		this.manager.merge(agente);
	}

	public Propietario busca(Integer id) {
		return this.manager.find(Propietario.class, id);
	}

	public List<Propietario> lista() {
		return this.manager.createQuery("from denuncia", Propietario.class)
				.getResultList();
	}

}
