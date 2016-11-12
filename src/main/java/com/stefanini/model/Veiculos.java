package com.stefanini.model;
// Generated 07/11/2016 12:04:56 by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Veiculos generated by hbm2java
 */
@Entity
@Table(name = "veiculos")
public class Veiculos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer idVeiculo;
	
	@Column(name = "placa", nullable = false, length = 7)
	private String placa;
	
	@ManyToOne
	private Proprietario proprietario;
	
	@ManyToOne
	private Modelo modelo;
	
	@Column(name = "uf", nullable = false, length = 2)
	private String uf;
	
	@OneToMany(mappedBy="placaVeic")
	private List<Infracoes> infracoes;

	public Integer getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(Integer idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public Veiculos() {
	}

	public Veiculos(String placa, Proprietario cpfProprietario, Modelo idModelo, String uf) {
		this.placa = placa;
		this.proprietario = cpfProprietario;
		this.modelo = idModelo;
		this.uf = uf;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
