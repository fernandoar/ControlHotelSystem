package br.com.csh.model.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="FuncionarioDependente")
public class FuncionarioDependenteBean extends GenericBean{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, length=150)
	private String nome;
	
	@Temporal(TemporalType.TIME)
	private Date dataNascimento;
	
	@ManyToOne
	@JoinColumn(name="funcionarioId")
	private FuncionarioBean funcionario;
	
	public String getNome(){
		return this.nome;
	}
	public FuncionarioDependenteBean setNome(String nome){
		this.nome = nome;
		
		return this;
	}
	
	public Date getDataNascimento(){
		return this.dataNascimento;
	}
	public FuncionarioDependenteBean setDataNascimento(Date dataNascimento){
		this.dataNascimento = dataNascimento;
		
		return this;
	}
	
	public FuncionarioBean getFuncionario(){
		return this.funcionario;
	}
	public FuncionarioDependenteBean setFuncionario(FuncionarioBean funcionario){
		this.funcionario = funcionario;
		
		return this;
	}
}