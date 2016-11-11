package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.model.Infracoes;
import com.stefanini.model.Proprietario;
import com.stefanini.model.Telefones;
import com.stefanini.model.Veiculos;
import com.stefanini.repository.AgenteRepository;
import com.stefanini.repository.InfracoesRepository;
import com.stefanini.repository.ProprietarioRepository;
import com.stefanini.repository.TelefoneRepository;
import com.stefanini.repository.VeiculosRepository;

@Stateless
public class AgenteService {

	@Inject
	private AgenteRepository agenteRepository;
	
	@Inject
	private InfracoesRepository infracoesRepository;
	
	@Inject
	private ProprietarioRepository proprietarioRepository;
	
	@Inject
	private TelefoneRepository telefoneRepository ;

	
	@Inject
	private VeiculosRepository veiculosRepository;
	
	
	public void incluir(Agente agente) {
		agenteRepository.salva(agente);
	}
	
	public void salva(Agente agente) {
		agenteRepository.salva(agente);
	}
	

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<Agente> listarAgente() {
		List<Proprietario> lista2 = proprietarioRepository.lista();
		List<Telefones> lista4 = telefoneRepository.lista();
		if(lista4.isEmpty()){
			
		}
		List<Veiculos> lista3 = veiculosRepository.lista();
	    if(lista3.isEmpty()){
	    	
	    }
	    if(lista2.isEmpty()){
	    	
	    }
	    Infracoes busca = infracoesRepository.busca(1);
		if(busca == null){
			
		}
		List<Infracoes> lista = infracoesRepository.lista();
		if(lista.isEmpty()){
			
		}
		return agenteRepository.lista();
	}
	
	public void atualizar(Agente agente){
		agenteRepository.altera(agente);
	}
	
	public void excluir(Integer i){
		agenteRepository.Excluir(i);
	}
	
	
	

}
