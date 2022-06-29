package RegistroDeEstudantes;

public abstract class Curso {


	
	protected String nome;
	protected int cpf;
	protected int idade;
	
	public Curso(String nome, int cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		
		}
		

	public void setNomealuno(String nome_a) {
		nome=nome_a;		
	}
	public void setCpf(int cpf_a) {
		cpf = cpf_a;
	}
	public void setIdade(int idade_a) {
		idade = idade_a;
	}
	public String getNomealuno() {
		return nome;
	}
	public int getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	
	
}