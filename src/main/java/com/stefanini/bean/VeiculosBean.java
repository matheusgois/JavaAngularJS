package com.stefanini.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.model.Categoria;
import com.stefanini.model.Modelo;
import com.stefanini.model.Veiculos;
import com.stefanini.service.VeiculosService;
@SessionScoped
@ManagedBean(name="veiculosMB")
public class VeiculosBean {
	
	@Inject
	private VeiculosService veiculosService;
	
	@Inject
	private Veiculos veiculos;

	@Inject
	private Modelo modelo;

	@Inject
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Veiculos getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}

	public List<Veiculos> ListarVeiculos()
	{
		return veiculosService.listarVeiculos();
	}
}
