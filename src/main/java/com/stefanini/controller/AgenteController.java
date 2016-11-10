package com.stefanini.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@Path("/agente")
@RequestScoped
public class AgenteController {

	@Inject
	private AgenteService agenteService;
	// private Agente agente;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Agente> get() {
		return agenteService.listarAgente();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void cadastrar(Agente a) {

		System.out.println("chegando no agentecontroller ");
		agenteService.incluir(a);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void alterar(Agente a) {

		System.out.println("alterando ");
		agenteService.salva(a);
	}

}
