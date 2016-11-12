package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Infracoes;
import com.stefanini.model.Modelo;

public class ModeloRepository {

	@Inject
	private EntityManager manager;

	public void salvar(Modelo modelo) {
		if (modelo.getIdModelo() != null) {
			this.manager.merge(modelo);
		} else {
			this.manager.persist(modelo);
		}
	}

	public Modelo busca(Integer id) {
		return this.manager.find(Modelo.class, id);
	}

	public List<Modelo> lista() {
		return this.manager.createQuery("select m from Modelo m", Modelo.class).getResultList();
	}
	
	public void Excluir(Integer id) {
		Modelo modelo = busca(id);
		manager.remove(modelo);
	}

}
