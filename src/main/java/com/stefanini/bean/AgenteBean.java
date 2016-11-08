package com.stefanini.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@SessionScoped
@ManagedBean(name="agenteMB")
public class AgenteBean {

	@Inject
	private AgenteService agenteService;
	
	@Inject
	private Agente agente;

	public void passar() throws IOException {
       
		FacesContext.getCurrentInstance().getExternalContext().redirect("pages/teste.xhtml");
		agenteService.incluir(this.agente);
		
	}

	public Agente getAgente() {
		if(agente ==null){
			agente = new Agente();
		}
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}
}
