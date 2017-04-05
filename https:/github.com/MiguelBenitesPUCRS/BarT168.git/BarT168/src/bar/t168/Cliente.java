package bar.t168;

public class Cliente {
	//cliente informe seu nome, CPF, idade e gênero. 
	private String nome;
	private String CPF;
	private int idade;
	private char genero;
	
	
	public Cliente() {
		this.nome = "Cliente";
		this.CPF = "99999999999";
		this.idade = 18;
		this.genero = 'M';
	}
	
	public Cliente(String nome, String cpf, int idade, char genero) {
		this.nome = nome;
		CPF = cpf;
		this.idade = idade;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	

}
