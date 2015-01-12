package br.com.csh.model.bean;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Pais")
public class PaisBean extends GenericBean {

	private static final long serialVersionUID = 1L;
	
	@Column(length=3, nullable=false)
	private char ddi;
	
	@Column(length=60, unique=true, nullable=false)
	private String descricao;
	
	@OneToMany(mappedBy="pais")
	private Collection<PessoaFisicaBean> pessoasFisicas;
	
	@OneToMany(mappedBy="pais")
	private Collection<EstadoBean> estados;
	
	public char getDdi(){
		return this.ddi;
	}
	public PaisBean setDdi(char ddi){
		this.ddi = ddi;
		return this;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	public PaisBean setDescricao(String descricao){
		this.descricao = descricao;
		return this;
	}
	
	public Collection<PessoaFisicaBean> getPessoasFisica(){
		if(this.pessoasFisicas == null)
			this.pessoasFisicas = Collections.emptyList();
		
		return this.pessoasFisicas;
	}
	public PaisBean setPessoasFisica(Collection<PessoaFisicaBean> pessoasFisica){
		this.pessoasFisicas = pessoasFisica;
		return this;
	}
	
	public Collection<EstadoBean> getEstados(){
		if(this.estados == null)
			this.estados = Collections.emptyList();
		
		return this.estados;
	}
	public PaisBean setEstados(Collection<EstadoBean> estados){
		this.estados = estados;
		return this;
	}
}