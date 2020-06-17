package com.totvs.application.impl;

import com.totvs.application.AlunoService;
import com.totvs.domain.aluno.AlunoRepository;
import com.totvs.infra.Logger;

public class AlunoServiceImpl implements AlunoService, Logger {

    private final AlunoRepository repository;

    public AlunoServiceImpl() {
        this.repository = new AlunoRepository();
    }

    public String build() {
        log("build");
        return String.format("Olá %s", repository.findAluno());
    }
}
