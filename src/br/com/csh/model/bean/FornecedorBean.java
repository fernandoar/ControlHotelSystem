package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.csh.model.TipoConta;

@Entity
@Table(name="Fornecedor")
public class FornecedorBean extends PessoaJuridicaBean {

	private static final long serialVersionUID = 1L;
	
	@Column(length=5, nullable=false)
	private String codigoBanco;
	
	@Enumerated
	private TipoConta tipoConta;
	
	@Column(nullable=false, length=10)
	private String agencia;
	
	@Column(nullable=false, length=10)
	private String numeroConta;
	
	@Column(length=5)
	private String codigoOperacao;
	
	@OneToMany(mappedBy="fornecedor")
	private Collection<ServicoPrestadoBean> servicosPrestados;
	
	public String getCodigoBanco(){
		return this.codigoBanco;
	}
	public FornecedorBean setCodigoBanco(String codigoBanco){
		this.codigoBanco = codigoBanco;
		
		return this;
	}
	
	public TipoConta getTipoConta(){
		return this.tipoConta;
	}
	public FornecedorBean setTipoConta(TipoConta tipoConta){
		this.tipoConta = tipoConta;
		
		return this;
	}
	
	public String getAgencia(){
		return this.agencia;
	}
	public FornecedorBean setAgencia(String agencia){
		this.agencia = agencia;
		
		return this;
	}
	
	public String getNumeroConta(){
		return this.numeroConta;
	}
	public FornecedorBean setNumeroConta(String numeroConta){
		this.numeroConta = numeroConta;
		
		return this;
	}
	
	public String getCodigoOperacao(){
		return this.codigoOperacao;
	}
	public FornecedorBean setCodigoOperacao(String codigoOperacao){
		this.codigoOperacao = codigoOperacao;
		
		return this;
	}
	
	public Collection<ServicoPrestadoBean> getServicosPrestados(){
		return this.servicosPrestados;
	}
	public FornecedorBean setServicosPrestados(Collection<ServicoPrestadoBean> servicosPrestados){
		this.servicosPrestados = servicosPrestados;
		
		return this;
	}
}