package atividade_02_10;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Aluno> alunos;

    public BancoDeDados() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) throws MatriculaExistente {
        for (Aluno a : alunos) {
            if (a.getMatricula() == aluno.getMatricula()) {
                 MatriculaExistente e = new MatriculaExistente ("Numero " + aluno.getMatricula());
                 throw e;
            }
        }
        
        alunos.add(aluno);
    }

   
}
