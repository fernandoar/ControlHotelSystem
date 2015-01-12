package br.com.csh.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Pessoa")
public abstract class PessoaBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pessoaID;
	@Column(name="email", length=150, nullable=true, unique=true)
	private String email;
	@Temporal(TemporalType.TIME)
	@Column(name="dtCadastro", nullable=false)
	private Date dataCadastro;
	@Temporal(TemporalType.TIME)
	@Column(name="dtAlteracao", nullable=true)
	private Date dataAlteracao;
	@Column(name="ativo", nullable=false)
	private Boolean ativo;
	
	public PessoaBean() {
		super();
	}   
	
	public PessoaBean(int pessoaID, String email, Date dataCadastro,
			Date dataAlteracao, Boolean ativo) {
		super();
		this.pessoaID = pessoaID;
		this.email = email;
		this.dataCadastro = dataCadastro;
		this.dataAlteracao = dataAlteracao;
		this.ativo = ativo;
	}

	public int getPessoaID() {
		return this.pessoaID;
	}
	public void setPessoaID(int pessoaID) {
		this.pessoaID = pessoaID;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
   
}
