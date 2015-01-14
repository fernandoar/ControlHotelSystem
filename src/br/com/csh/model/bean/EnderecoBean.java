package br.com.csh.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Endereco")
public class EnderecoBean extends GenericBean {

	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=5)
	private int numero;
	
	@Column(nullable=false, length=8)
	private String cep;
	
	@Column(nullable=false, length=150)
	private String bairro;
	
	@Column(length=100)
	private String complemento;
	
	@Column(length=100)
	private String referencia;
	
	@ManyToOne
	@JoinColumn(name="pessoaId")
	private PessoaBean pessoa;
	
	@ManyToOne
	@JoinColumn(name="tipoEnderecoId")
	private TipoEnderecoBean tipoEndereco;
	
	@ManyToOne
	@JoinColumn(name="cidadeId")
	private CidadeBean cidade;
	
	@ManyToOne
	@JoinColumn(name="tipoLogradouroId")
	private TipoLogradouroBean tipoLogradouro;
	
	public int getNumero(){
		return this.numero;
	}
	public EnderecoBean setNumero(int numero){
		this.numero = numero;
		
		return this;
	}
	
	public String getCep(){
		return this.cep;
	}
	public EnderecoBean setCep(String cep){
		this.cep = cep;
		
		return this;
	}
	
	public String getBairro(){
		return this.bairro;
	}
	public EnderecoBean setBairro(String bairro){
		this.bairro = bairro;
		
		return this;
	}
	
	public String getComplemento(){
		return this.complemento;		
	}
	public EnderecoBean setComplemento(String complemento){
		this.complemento = complemento;
		
		return this;
	}
	
	public String getReferencia(){
		return this.referencia;
	}
	public EnderecoBean setReferencia(String referencia){
		this.referencia = referencia;
		
		return this;
	}
	
	public PessoaBean getPessoa(){
		return this.pessoa;
	}
	public EnderecoBean setPessoa(PessoaBean pessoa){
		this.pessoa = pessoa;
		
		return this;
	}
	
	public TipoEnderecoBean getTipoEndereco(){
		return this.tipoEndereco;
	}
	public EnderecoBean setTipoEndereco(TipoEnderecoBean tipoEndereco){
		this.tipoEndereco = tipoEndereco;
		
		return this;
	}
	
	public CidadeBean getCidade(){
		return this.cidade;
	}
	public EnderecoBean setCidade(CidadeBean cidade){
		this.cidade = cidade;
		
		return this;
	}
	
	public TipoLogradouroBean getTipoLogradouro(){
		return this.tipoLogradouro;
	}
	public EnderecoBean setTipoLogradouro(TipoLogradouroBean tipoLogradouro){
		this.tipoLogradouro = tipoLogradouro;
		
		return this;
	}
}