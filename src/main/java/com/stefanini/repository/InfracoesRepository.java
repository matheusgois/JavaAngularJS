package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Infracoes;

public class InfracoesRepository {

	@Inject
	private EntityManager manager;

	public void salvar(Infracoes infracoes) {
		if (infracoes.getIdInfracao() != null) {
			this.manager.merge(infracoes);
		} else {
			this.manager.persist(infracoes);
		}
	}

	public Infracoes busca(Integer id) {
		return this.manager.find(Infracoes.class, id);
	}

	public List<Infracoes> lista() {
		return this.manager.createQuery("select i from Infracoes i", Infracoes.class).getResultList();
	}

	public void Excluir(Integer id) {
		Infracoes infracoes = busca(id);
		manager.remove(infracoes);
	}
}
