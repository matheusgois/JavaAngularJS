package com.stefanini.bean;

import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.service.DenuncianteService;

@Named( "denunciaMB")
public class DenunciaBean {

    @Inject
    private DenuncianteService denuncianteService;

    public String chamar() {
        return "/pages/teste";
    }

}
