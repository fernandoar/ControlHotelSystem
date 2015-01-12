package br.com.csh.model;

public enum Sexo {
	F("Feminino"),
	M("Masculino");
	
	private String descricao;
	
	private Sexo(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	public Sexo setDescricao(String descricao){
		this.descricao = descricao;
		
		return this;
	}
}