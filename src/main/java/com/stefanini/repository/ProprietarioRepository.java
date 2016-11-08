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

	public void altera(Agente agente) {
		this.manager.merge(agente);
	}

	public Agente busca(Integer id) {
		return this.manager.find(Agente.class, id);
	}

	public List<Agente> lista() {
		return this.manager.createQuery("from denuncia", Agente.class)
				.getResultList();
	}

}
