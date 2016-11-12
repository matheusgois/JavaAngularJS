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

import com.stefanini.model.Proprietario;
import com.stefanini.service.ProprietarioService;

@Path("/Proprietario")
@RequestScoped
public class ProprietarioController {
	
	@Inject
	private ProprietarioService proprietarioService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Proprietario> get() {
		return proprietarioService.listarProprietario();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void cadastrar(Proprietario proprietario) {
		System.out.println("chegando no proprietariocontroller ");
		proprietarioService.salvar(proprietario);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void alterar(Proprietario proprietario) {
		proprietarioService.salvar(proprietario);
	}
	
	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") Integer id){
		proprietarioService.excluir(id);
		
	}

}
