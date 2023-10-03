package atividade_02_10;

public class Aluno {
	private String nome;
	private String Endereco;
	private String cpf;
	private int matricula;
	
	

	public Aluno() {
		
	}
	
	

	public Aluno(String nome,String Endereco, String cpf, int matricula) {
		super();
		this.nome = nome;
		this.Endereco = Endereco;
		this.cpf = cpf;
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula){
		this.matricula = matricula;
	}

	public String getEndereco() {

		return Endereco;
	}
	
	
	
}
