package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cidade")
public class CidadeBean extends GenericBean {

	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=80)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="estadoId")
	private EstadoBean estado;
	
	public String getDescricao(){
		return descricao;
	}
	public CidadeBean setDescricao(String descricao){
		this.descricao = descricao;
		
		return this;
	}
	
	public EstadoBean getEstado(){
		return this.estado;
	}
	public CidadeBean setEstado(EstadoBean estado){
		this.estado = estado;
		return this;
	}
}