package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Propietario;
import com.stefanini.model.Tipotelefone;
import com.stefanini.repository.PropietarioRepository;
import com.stefanini.repository.TipoTelefonesRepository;

@Stateless
public class PropietarioService {
	
	@Inject
	private PropietarioRepository proprietarioRepository;
	
	@Inject
	private TipoTelefonesRepository tipoTelefonesRepository;
	
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Propietario propietario){
    	proprietarioRepository.incluirAgente(propietario);
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public List<Tipotelefone> buscarTelefones()
    {
    	return tipoTelefonesRepository.listar();
 
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void cadastraTipo(Tipotelefone tipoTelefone){
    	tipoTelefonesRepository.CadastraTipo(tipoTelefone);
    }
    
    
}
