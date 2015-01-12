package br.com.csh.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="PessoaFisica")
public class PessoaFisicaBean extends PessoaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String rg;
	private String orgaoEmissor;
	
	public PessoaFisicaBean() {
		super();
	}
	
	public PessoaFisicaBean(int pessoaID, String email, Date dataCadastro,
			Date dataAlteracao, Boolean ativo, String nome,
			Date dataNascimento, String cpf, String rg, String orgaoEmissor) {
		super(pessoaID, email, dataCadastro, dataAlteracao, ativo);
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
}