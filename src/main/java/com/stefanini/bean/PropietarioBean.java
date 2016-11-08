package com.stefanini.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.stefanini.model.Estados;
import com.stefanini.model.Proprietario;
import com.stefanini.model.Telefones;
import com.stefanini.model.TelefonesId;
import com.stefanini.model.TiposTel;
import com.stefanini.model.Tipotelefone;
import com.stefanini.service.PropietarioService;

@SessionScoped
@ManagedBean(name = "propietarioMB")
public class PropietarioBean {

	@Inject
	private PropietarioService propietarioservice;
	@Inject
	private Proprietario propietario;
	@Inject
	private Telefones telefones;
	@Inject
	private Tipotelefone tpelefone;
	
	@Inject
	private TelefonesId telefonesId;

	private Estados estados;

	public Tipotelefone getTpelefone() {
		return tpelefone;
	}

	public void setTpelefone(Tipotelefone tpelefone) {
		this.tpelefone = tpelefone;
	}

	public Telefones getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefones telefones) {
		this.telefones = telefones;
	}

	public Proprietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Proprietario propietario) {
		this.propietario = propietario;
	}

	public List<Tipotelefone> listartipos() {
		return propietarioservice.buscarTelefones();
	}

	public Estados[] getStatuses() {
		return Estados.values();
	}
	
	public TiposTel[] getTiposTel() {
		return TiposTel.values();
	}
	
	public void salvar()
	{
		propietarioservice.cadastraTipo(tpelefone);
	
	}

	public TelefonesId getTelefonesId() {
		return telefonesId;
	}

	public void setTelefonesId(TelefonesId telefonesId) {
		this.telefonesId = telefonesId;
	}

}
