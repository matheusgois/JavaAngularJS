package com.stefanini.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.model.Infracoes;
import com.stefanini.service.InfracoesService;

@Path("/Infracao")
@RequestScoped
public class InfracaoController {

	@Inject
	private InfracoesService infracoesService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Infracoes> get() {
		return infracoesService.listarInfracoes();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void cadastrar(Infracoes infracoes) {
		infracoesService.salvar(infracoes);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void alterar(Infracoes infracoes) {
		infracoesService.salvar(infracoes);;
	}

	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") Integer id) {
		infracoesService.excluir(id);

	}

}
