package com.stefanini.bean;

import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.model.Localinfracao;
import com.stefanini.model.Tipoinfracao;
import com.stefanini.model.Veiculos;

public class InfracoesBean {
	
	@Inject
	private Agente agente;
	
	@Inject
	private Veiculos veiculos;
	
	@Inject
	private Tipoinfracao tipoinfracao;
	
	@Inject
	private Localinfracao localinfracao;

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public Veiculos getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}

	public Tipoinfracao getTipoinfracao() {
		return tipoinfracao;
	}

	public void setTipoinfracao(Tipoinfracao tipoinfracao) {
		this.tipoinfracao = tipoinfracao;
	}

	public Localinfracao getLocalinfracao() {
		return localinfracao;
	}

	public void setLocalinfracao(Localinfracao localinfracao) {
		this.localinfracao = localinfracao;
	}
	

}
