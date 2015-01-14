package br.com.csh.model.bean;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Funcionario")
public class FuncionarioBean extends PessoaFisicaBean{

	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=8)
	private String pis;
	
	@Column(nullable=false, scale=8, precision=2)
	private double salario;
	
	@Temporal(TemporalType.TIME)
	private Date dataAdmissao;
	
	@Temporal(TemporalType.TIME)
	private Date dataDemissao;
	
	@OneToMany(mappedBy="funcionario")
	private Collection<FuncionarioDependenteBean> funcionarioDependentes;
	
	public String getPis(){
		return this.pis;
	}
	public FuncionarioBean setPis(String pis){
		this.pis = pis;
		
		return this;
	}
	
	public double getSalario(){
		return this.salario;
	}
	public FuncionarioBean setSalario(double salario){
		this.salario = salario;
		
		return this;
	}
	
	public Date getDataAdmissao(){
		return this.dataAdmissao;
	}
	public FuncionarioBean setDataAdmissao(Date dataAdmissao){
		this.dataAdmissao = dataAdmissao;
		
		return this;
	}
	
	public Date getDataDemissao(){
		return this.dataDemissao;
	}
	public FuncionarioBean setDataDemissao(Date dataDemissao){
		this.dataDemissao = dataDemissao;
		
		return this;
	}
	
	public Collection<FuncionarioDependenteBean> getFuncionarioDependentes(){
		return this.funcionarioDependentes;
	}
	public FuncionarioBean setFuncionarioDependentes(Collection<FuncionarioDependenteBean> funcionarioDependentes){
		this.funcionarioDependentes = funcionarioDependentes;
		
		return this;
	}
}