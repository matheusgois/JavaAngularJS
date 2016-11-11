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

import com.stefanini.model.Veiculos;
import com.stefanini.service.VeiculosService;

@Path("/Veiculos")
@RequestScoped
public class VeiculosController {

	@Inject
	private VeiculosService veiculosService;
	// private Veiculos Veiculos;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Veiculos> get() {
		return veiculosService.listarVeiculos();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void cadastrar(Veiculos a) {

		System.out.println("chegando no Veiculoscontroller ");
		veiculosService.incluir(a);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void alterar(Veiculos a) {

		System.out.println("alterando ");
		//veiculosService.salva(a);
	}
	
//	@DELETE
//	@Path("/{id}")
//	public void excluir(@PathParam("id") Veiculos id){
//		veiculosService.incluir(id);
//		
//	}
//	
	
	
}
