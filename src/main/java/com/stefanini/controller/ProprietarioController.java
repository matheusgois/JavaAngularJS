package com.stefanini.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.model.Proprietario;
import com.stefanini.service.ProprietarioService;

@Path("/propri")
@RequestScoped
public class ProprietarioController {
	
	@Inject
	private ProprietarioService proprietarioService;
	// private Proprietario proprietario;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Proprietario> get() {
		return proprietarioService.listarProprietario();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void cadastrar(Proprietario a) {

		System.out.println("chegando no proprietariocontroller ");
//		proprietarioService.incluir(a);
	}

//	@PUT
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public void alterar(Proprietario a) {
//
//		System.out.println("alterando ");
//		proprietarioService.salva(a);
//	}
//	
//	@DELETE
//	@Path("/{id}")
//	public void excluir(@PathParam("id") Integer id){
//		proprietarioService.excluir(id);
//		
//	}
//	
	


}
