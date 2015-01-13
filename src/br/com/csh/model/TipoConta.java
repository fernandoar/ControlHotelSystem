package br.com.csh.model;

public enum TipoConta {
	CP("Poupança"),
	CC("Conta Corrente");
	
	private String descricao;
	
	private TipoConta(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	public TipoConta setDescricao(String descricao){
		this.descricao = descricao;
		
		return this;
	}
}