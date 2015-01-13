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
@Table(name="QuartoLog")
public class QuartoLogBean extends GenericBean {

	private static final long serialVersionUID = 1L;

	@Column(length=400)
	private String observacao;
	
	@Temporal(TemporalType.TIME)
	private Date dataOperacao;
	
	@ManyToOne
	@JoinColumn(name="quartoId")
	private QuartoBean quarto;
	
	public String observacao(){
		return this.observacao;
	}
	public QuartoLogBean setObservacao(String observacao){
		this.observacao = observacao;
		
		return this;
	}
	
	public Date getDataOperacao(){
		return this.dataOperacao;
	}
	public QuartoLogBean setDataOperacao(Date dataOperacao){
		this.dataOperacao = dataOperacao;
		
		return this;
	}
	
	public QuartoBean getQuarto(){
		return this.quarto;
	}
	public QuartoLogBean setQuarto(QuartoBean quarto){
		this.quarto = quarto;
		
		return this;
	}
}