package atividade_02_10;

public class MatriculaExistente extends Exception {
	public MatriculaExistente(String message) {
        super(message+" de matricula já existe em nosso Sistema");
    }

}
