package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Agente;
import com.stefanini.model.Proprietario;

public class ProprietarioRepository {
	@Inject
	private EntityManager manager;

	public void incluirPropietario(Proprietario propietario) {
		this.manager.persist(propietario);
	}

	public void altera(Proprietario propietario) {
		this.manager.merge(propietario);
	}

	public Agente busca(Integer id) {
		return this.manager.find(Agente.class, id);
	}

	public List<Proprietario> lista() {
		return this.manager.createQuery("from propietario", Proprietario.class)
				.getResultList();
	}

}
