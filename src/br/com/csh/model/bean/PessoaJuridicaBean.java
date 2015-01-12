package br.com.csh.model.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="PessoaJuridica")
public class PessoaJuridicaBean extends PessoaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String razaoSocial;
	private String fantasia;
	private String CNPJ;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	private String codigoReserva;
	
	public PessoaJuridicaBean() {
		super();
	}
	
	public PessoaJuridicaBean(int pessoaID, String email, Date dataCadastro,
			Date dataAlteracao, Boolean ativo, String razaoSocial,
			String fantasia, String cNPJ, String inscricaoEstadual,
			String inscricaoMunicipal, String codigoReserva) {
		super(pessoaID, email, dataCadastro, dataAlteracao, ativo);
		this.razaoSocial = razaoSocial;
		this.fantasia = fantasia;
		CNPJ = cNPJ;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.codigoReserva = codigoReserva;
	}

	public PessoaJuridicaBean(int pessoaID, String email, Date dataCadastro,
			Date dataAlteracao, Boolean ativo) {
		super(pessoaID, email, dataCadastro, dataAlteracao, ativo);
		// TODO Auto-generated constructor stub
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}	
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	
	public String getCodigoReserva() {
		return codigoReserva;
	}
	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
}
