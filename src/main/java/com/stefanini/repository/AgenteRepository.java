package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Agente;

public class AgenteRepository {

	@Inject
	private EntityManager manager;

	public Agente busca(Integer id) {
		return this.manager.find(Agente.class, id);
	}

	public List<Agente> lista() {
		return this.manager.createQuery("select a from Agente a join fetch a.infracoes", Agente.class).getResultList();
	}

	public void remove(Agente agente) {
		System.out.println("Deletando repository");
	}

	public void salva(Agente agente) {
		if (agente.getIdAgente() != null) {
			this.manager.merge(agente);
		} else {
			this.manager.persist(agente);
		}
	}

	public void Excluir(Integer id) {
		Agente a = busca(id);
		manager.remove(a);
	}

}
