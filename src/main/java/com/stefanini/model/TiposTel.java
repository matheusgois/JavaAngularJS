package com.stefanini.model;

public enum TiposTel {
	
	RESINDECIAL("1"), 
	COMERCIAL("2"),
	CELULAR("3");
	
	protected String descricao = null;

	private TiposTel(String descricao) {
	this.descricao = descricao;
	}

}
