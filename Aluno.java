
package RegistroDeEstudantes;

public class Aluno extends Curso {
	
	
	private String codigo;
	private String nomecurso;
	
	
	public Aluno(String nome, int cpf, int idade, String codigo, String nomecurso) {
		
		super(nome, cpf, idade);
		this.codigo = codigo;
		this.nomecurso = nomecurso;
		
	}
	public void setCodigo(String codigo_cur) {
		codigo = codigo_cur;
	}
	public void setNomecurso(String nome_cur) {
		nomecurso=nome_cur;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNomecurso() {
		return nomecurso;
	}
	public void imprimir() {
		System.out.println("===============================");
		System.out.println("Aluno cadastrado:");
		System.out.println("NOME:" + this.nome);
		System.out.println("CPF:" + this.cpf);
		System.out.println("IDADE:" + this.idade);
		System.out.println("CURSO:" + this.nomecurso);
		System.out.println("CÓDIGO DO CURSO:" + this.codigo);
		System.out.println("===============================");
	}
	 
}
