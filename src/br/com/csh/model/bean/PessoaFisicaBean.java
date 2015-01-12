package br.com.csh.model.bean;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.csh.model.Sexo;

@Entity
@Table(name="PessoaFisica")
public class PessoaFisicaBean extends PessoaBean {

	private static final long serialVersionUID = 1L;
	
	@Column(length=150, nullable=false)
	private String nome;
	
	@Enumerated
	private Sexo sexo;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(length=12, nullable=false)
	private String cpf;
	
	@Column(length=30)
	private String rg;
	
	@Column(length=5)
	private String orgaoEmissor;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="estadoCivilId")
	private EstadoCivilBean estadoCivil;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="profissaoId")
	private ProfissaoBean profissao;
	
	@ManyToMany(mappedBy="pessoasFisica")
	private Collection<PessoaJuridicaBean> pessoasJuridica;
	
	public String getNome() {
		return nome;
	}
	public PessoaFisicaBean setNome(String nome) {
		this.nome = nome;
		
		return this;
	}
	
	public Sexo getSexo(){
		return this.sexo;
	}
	public PessoaFisicaBean setSexo(Sexo sexo){
		this.sexo = sexo;
		
		return this;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public PessoaFisicaBean setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
		
		return this;
	}
	
	public String getCpf() {
		return cpf;
	}
	public PessoaFisicaBean setCpf(String cpf) {
		this.cpf = cpf;
		
		return this;
	}
	
	public String getRg() {
		return rg;
	}
	public PessoaFisicaBean setRg(String rg) {
		this.rg = rg;
		
		return this;
	}
	
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public PessoaFisicaBean setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
		
		return this;
	}
}