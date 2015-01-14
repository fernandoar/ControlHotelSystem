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
@Table(name="ServicoPrestado")
public class ServicoPrestadoBean extends GenericBean {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, length=100)
	private String nomeArquivo;
	
	@Column(nullable=false, length=2)
	private int avaliacao;
	
	@Column(nullable=false, scale=8, precision=2)
	private double valorPrestado;
	
	@Temporal(TemporalType.TIME)
	private Date dataCompetenciaNota;
	
	@ManyToOne
	@JoinColumn(name="fornecedorId")
	private FornecedorBean fornecedor;
	
	public String getNomeArquivo(){
		return this.nomeArquivo;
	}
	public ServicoPrestadoBean setNomeArquivo(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
		
		return this;
	}
	
	public int getAvaliacao(){
		return this.avaliacao;
	}
	public ServicoPrestadoBean setAvalicao(int avaliacao){
		this.avaliacao = avaliacao;
		
		return this;
	}
	
	public double getValorPrestado(){
		return this.valorPrestado;
	}
	public ServicoPrestadoBean setValorPrestado(double valorPrestado){
		this.valorPrestado = valorPrestado;
		
		return this;
	}
	
	public Date getDataCompetenciaNota(){
		return this.dataCompetenciaNota;
	}
	public ServicoPrestadoBean setDataCompetenciaNota(Date dataCompetenciaNota){
		this.dataCompetenciaNota = dataCompetenciaNota;
		
		return this;
	}
	
	public FornecedorBean getFornecedor(){
		return this.fornecedor;
	}
	public ServicoPrestadoBean setFornecedor(FornecedorBean fornecedor){
		this.fornecedor = fornecedor;
		
		return this;
	}
}