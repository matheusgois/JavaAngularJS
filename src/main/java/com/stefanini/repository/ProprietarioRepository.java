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

	public Proprietario busca(Integer id) {
		return this.manager.find(Proprietario.class, id);
	}

	public List<Proprietario> lista() {
		return this.manager.createQuery("select p from Proprietario p", Proprietario.class)
				.getResultList();
	}

}
