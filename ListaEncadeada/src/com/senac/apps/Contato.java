package com.senac.apps;

public class Contato {

	private String nome;
	private String telefone;
	
	public Contato(String nome, String Telefone) {
		this.nome = nome;
		this.telefone = telefone;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int compareTo(Contato inserindo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}//fim
