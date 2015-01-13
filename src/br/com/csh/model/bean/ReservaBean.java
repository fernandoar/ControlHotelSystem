package br.com.csh.model.bean;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Reserva")
public class ReservaBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	@Column(length=150)
	private String codigoReservaJuridica;
	
	@Temporal(TemporalType.TIME)
	@Column(nullable=false)
	private Date dataInicio;
	
	@Temporal(TemporalType.TIME)
	@Column(nullable=false)
	private Date dataFim;
	
	@Temporal(TemporalType.TIME)
	private Date dataCheckIn;
	
	@Temporal(TemporalType.TIME)
	private Date dataCheckOut;
	
	@Temporal(TemporalType.TIME)
	private Date dataCancelamento;
	
	@Column(nullable=false, scale=8, precision=2)
	private double valorTotal;
	
	@ManyToOne
	@JoinColumn(name="pessoaFisicaId")
	private PessoaFisicaBean cliente;
	
	@ManyToOne
	@JoinColumn(name="quartoId")
	private QuartoBean quarto;
	
	@OneToMany(mappedBy="reserva")
	private Collection<HospedeBean>	hospedes;
	
	public String getCodigoReservaJuridica(){
		return this.codigoReservaJuridica;
	}
	public ReservaBean setCodigoReservaJuridica(String codigoReservaJuridica){
		this.codigoReservaJuridica = codigoReservaJuridica;
		
		return this;
	}
	
	public Date getDataInicio(){
		return this.dataInicio;
	}
	public ReservaBean setDataInicio(Date dataInicio){
		this.dataInicio = dataInicio;
		
		return this;
	}
	
	public Date getDataFim(){
		return this.dataFim;
	}
	public ReservaBean setDataFim(Date dataFim){
		this.dataFim = dataFim;
		
		return this;
	}
	
	public Date getDataCheckIn(){
		return this.dataCheckIn;
	}
	public ReservaBean setDataCheckIn(Date dataCheckIn){
		this.dataCheckIn = dataCheckIn;
		
		return this;
	}
	
	public Date getDataCheckOut(){
		return this.dataCheckOut;
	}
	public ReservaBean setDataCheckOut(Date dataCheckOut){
		this.dataCheckOut = dataCheckOut;
		
		return this;
	}
	
	public Date getDataCancelamento(){
		return this.dataCancelamento;
	}
	public ReservaBean setDataCancelamento(Date dataCancelamento){
		this.dataCancelamento = dataCancelamento;
		
		return this;
	}
	
	public double getValorTotal(){
		return this.valorTotal;
	}
	public ReservaBean setValorTotal(double valorTotal){
		this.valorTotal = valorTotal;
		
		return this;
	}
	
	public PessoaFisicaBean getCliente(){
		return this.cliente;
	}
	public ReservaBean setCliente(PessoaFisicaBean cliente){
		this.cliente = cliente;
		
		return this;
	}
	
	public QuartoBean getQuarto(){
		return this.quarto;
	}
	public ReservaBean setQuarto(QuartoBean quarto){
		this.quarto = quarto;
		
		return this;
	}
	
	public Collection<HospedeBean> getHospedes(){
		return this.hospedes;
	}
	public ReservaBean setHospedes(Collection<HospedeBean> hospedes){
		this.hospedes = hospedes;
		
		return this;
	}
}