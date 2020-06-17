package com.totvs.api;

import com.totvs.application.AlunoService;
import com.totvs.application.impl.AlunoServiceImpl;
import com.totvs.infra.Logger;

public class AlunoResource implements Logger {

    private final AlunoService service;

    public AlunoResource(){
        this.service = new AlunoServiceImpl();
    }

    public boolean print(){
        log("print");
        try {
            final String mensagem = service.build();
            System.out.println(mensagem);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
