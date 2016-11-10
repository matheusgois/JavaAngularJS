package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Agente;
import com.stefanini.model.Denuncia;

public class DenuncianteRepository {

	@Inject
	private EntityManager manager;

	public void incluir(Denuncia denuncia) {
		this.manager.persist(denuncia);
	}

	public void altera(Denuncia denuncia) {
		this.manager.merge(denuncia);
	}

	public Denuncia busca(Integer id) {
		return this.manager.find(Denuncia.class, id);
	}

	public List<Denuncia> lista() {
		return this.manager.createQuery("select c from denuncia c", Denuncia.class)
				.getResultList();
	}
	
	public void salva(Agente agente) {
		if (agente.getIdAgente() != null) {
			this.manager.merge(agente);
		} else {
			this.manager.persist(agente);
		}
	}
}




