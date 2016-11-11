package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Telefones;

public class TelefoneRepository {

	
	@Inject
	private EntityManager manager;

	public void salvar(Telefones telefones) {
		this.manager.persist(telefones);
	}

	public void altera(Telefones telefones) {
		this.manager.merge(telefones);
	}

	public Telefones busca(Integer id) {
		return this.manager.find(Telefones.class, id);
	}

	public List<Telefones> lista() {
		return this.manager.createQuery("select a from Telefones a", Telefones.class)
				.getResultList();
	}
}
