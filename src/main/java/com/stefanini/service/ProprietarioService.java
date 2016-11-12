package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Proprietario;
import com.stefanini.repository.ProprietarioRepository;

@Stateless
public class ProprietarioService {
	
	@Inject
	private ProprietarioRepository proprietarioRepository;
	
    public void salvar(Proprietario propietario){
    	proprietarioRepository.salvar(propietario);
    }
    
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<Proprietario> listarProprietario() {
		return proprietarioRepository.lista();
	}
	
	public void excluir(Integer id){
		proprietarioRepository.Excluir(id);
	}
    
    public Proprietario buscarProprietario(Integer id){
    	return proprietarioRepository.busca(id);
    }
}
