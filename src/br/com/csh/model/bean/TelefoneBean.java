package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Telefone")
public class TelefoneBean extends GenericBean {

	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=3)
	private String ddd;
	
	@Column(nullable=false, length=14)
	private String numero;
	
	@Column(length=150)
	private String contato;
	
	@ManyToOne
	@JoinColumn(name="tipoTelefoneId")
	private TipoTelefoneBean tipoTelefone;
	
	public String getDdd(){
		return this.ddd;
	}
	public TelefoneBean setDdd(String ddd){
		this.ddd = ddd;
		
		return this;
	}
	
	public String getNumero(){
		return this.numero;
	}
	public TelefoneBean setNumero(String numero){
		this.numero = numero;
		
		return this;
	}
	
	public String getContato(){
		return this.contato;
	}
	public TelefoneBean setContato(String contato){
		this.contato = contato;
		
		return this;
	}
	
	public TipoTelefoneBean getTipoTelefone(){
		return this.tipoTelefone;
	}
	public TelefoneBean setTipoTelefone(TipoTelefoneBean tipoTelefone){
		this.tipoTelefone = tipoTelefone;
		
		return this;
	}
}