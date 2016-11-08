package com.stefanini.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.stefanini.model.Propietario;
import com.stefanini.service.AgenteService;

@SessionScoped
@ManagedBean(name="agenteMB")
public class AgenteBean {

	@Inject
	private AgenteService agenteService;
	
	@Inject
	private Propietario agente;

	public void passar() throws IOException {
       
		FacesContext.getCurrentInstance().getExternalContext().redirect("pages/teste.xhtml");
		agenteService.incluir(this.agente);
		
	}

	public Propietario getAgente() {
		if(agente ==null){
			agente = new Propietario();
		}
		return agente;
	}

	public void setAgente(Propietario agente) {
		this.agente = agente;
	}
}
