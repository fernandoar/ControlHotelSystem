package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Hospede")
public class HospedeBean extends GenericBean {

	private static final long serialVersionUID = 1L;

	@Column(length=150, nullable=false)
	private String nome;
	
	@OneToOne
	@JoinColumn(name="pessoaFisicaId")
	private PessoaFisicaBean cliente;
	
	@ManyToOne
	@JoinColumn(name="reservaId")
	private ReservaBean reserva;
	
	public String getNome(){
		return this.nome;
	}
	public HospedeBean setNome(String nome){
		this.nome = nome;
		
		return this;
	}
	
	public PessoaFisicaBean getCliente(){
		return this.cliente;
	}
	public HospedeBean setCliente(PessoaFisicaBean cliente){
		this.cliente = cliente;
		
		return this;
	}
	
	public ReservaBean getReserva(){
		return this.reserva;
	}
	public HospedeBean setReserva(ReservaBean reserva){
		this.reserva = reserva;
		
		return this;
	}
}