package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="QuartoOpcional")
public class QuartoOpcionalBean extends GenericBean {

	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=100)
	private String descricao;
	
	@Column(nullable=false, scale=8, precision=2)
	private double valor;
	
	@Column(nullable=false, length=3)
	private int estoque;
	
	@ManyToMany(mappedBy="quartoOpcionais")
	private Collection<QuartoBean> quartos;
	
	public String getDescricao(){
		return this.descricao;
	}
	public QuartoOpcionalBean setDescricao(String descricao){
		this.descricao = descricao;
		
		return this;
	}
	
	public double getValor(){
		return this.valor;
	}
	public QuartoOpcionalBean setValor(double valor){
		this.valor = valor;
		
		return this;
	}
	
	public int getEstoque(){
		return this.estoque;
	}
	public QuartoOpcionalBean setEstoque(int estoque){
		this.estoque = estoque;
		
		return this;
	}
	
	public Collection<QuartoBean> getQuartos(){
		return this.quartos;
	}
	public QuartoOpcionalBean setQuartos(Collection<QuartoBean> quartos){
		this.quartos = quartos;
		
		return this;
	}
}