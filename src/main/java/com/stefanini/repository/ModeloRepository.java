package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebParam.Mode;
import javax.persistence.EntityManager;

import com.stefanini.model.Agente;
import com.stefanini.model.Modelo;
import com.stefanini.model.Veiculos;

public class ModeloRepository {

	
	@Inject
	private EntityManager manager;

	public void salvar(Modelo modelo) {
		this.manager.persist(modelo);
	}

	public void altera(Modelo modelo) {
		this.manager.merge(modelo);
	}

	public Modelo busca(Integer id) {
		return this.manager.find(Modelo.class, id);
	}

	public List<Modelo> lista() {
		return this.manager.createQuery("select m from Modelo m", Modelo.class)
				.getResultList();
	}

}
