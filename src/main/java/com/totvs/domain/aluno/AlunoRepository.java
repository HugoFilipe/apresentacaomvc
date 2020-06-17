package com.totvs.domain.aluno;
import com.ibm.jvm.Log;
import com.totvs.infra.Logger;

public class AlunoRepository implements Logger {
    private static final String NOME = "Hugo Filipe";

    public String findAluno(){
        log("findAluno");
        return NOME;
    }
}
