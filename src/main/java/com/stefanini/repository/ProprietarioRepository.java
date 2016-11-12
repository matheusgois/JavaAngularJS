package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Infracoes;
import com.stefanini.model.Proprietario;

public class ProprietarioRepository {
	@Inject
	private EntityManager manager;

	public void salvar(Proprietario propietario) {
		if (propietario.getCpfProprietario() != null) {
			this.manager.merge(propietario);
		} else {
			this.manager.persist(propietario);
		}
	}

	public Proprietario busca(Integer id) {
		return this.manager.find(Proprietario.class, id);
	}

	public List<Proprietario> lista() {
		return this.manager.createQuery("select p from Proprietario p join fetch p.veiculos", Proprietario.class)
				.getResultList();
	}
	
	public void Excluir(Integer id) {
		Proprietario proprietario = busca(id);
		manager.remove(proprietario);		
	}

}
