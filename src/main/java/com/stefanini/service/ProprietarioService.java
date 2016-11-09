package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Proprietario;
import com.stefanini.model.Telefones;
import com.stefanini.model.Tipotelefone;
import com.stefanini.repository.ProprietarioRepository;
import com.stefanini.repository.TipoTelefonesRepository;

@Stateless
public class ProprietarioService {
	
	@Inject
	private ProprietarioRepository proprietarioRepository;
	
	@Inject
	private TipoTelefonesRepository tipoTelefonesRepository;
	
    public void incluir(Proprietario propietario, Telefones telefones){
    	proprietarioRepository.incluirPropietario(propietario);
    	
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
