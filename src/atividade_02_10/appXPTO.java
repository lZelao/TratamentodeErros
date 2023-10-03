package atividade_02_10;
import java.util.List;

public class appXPTO {

	 public static void main(String[] args) {
	        BancoDeDados banco = new BancoDeDados();
	        List<Aluno> alunos = null;

	        try {
	            banco.adicionarAluno(new Aluno("João", "Rua A, 123","545688484", 1));
	            banco.adicionarAluno(new Aluno("Maria", "Rua B, 456","87945647", 2));
	            banco.adicionarAluno(new Aluno("Pedro", "Rua C, 789", "786767",  1));
	            System.out.println("Aluno cadastrado com sucesso!!");

	        } catch (MatriculaExistente e) {
	            System.out.println("Erro ao adicionar aluno: " + e.getMessage());
	        }
	        
	    }

}
