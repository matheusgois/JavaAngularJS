package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Denuncia;

@Stateless
public class DenuncianteService {

    @Inject
    private DenuncianteService denuncianteRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Denuncia denuncia){
        denuncianteRepository.incluir(denuncia);
    }
//passa carai
}
