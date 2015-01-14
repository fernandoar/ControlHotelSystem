package br.com.csh.model.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EstadoCivil")
public class EstadoCivilBean extends GenericBean {
	private static final long serialVersionUID = 1L;
	
	@Column(length=20, nullable=false, unique=true)
	private String descricao;
	
	@OneToMany(mappedBy="estadoCivil")
	private Collection<PessoaFisicaBean> pessoasFisica;
	
	public String getDescricao() {
		return descricao;
	}
	public EstadoCivilBean setDescricao(String descricao) {
		this.descricao = descricao;
		
		return this;
	}
	
	public Collection<PessoaFisicaBean> getPessoasFisica(){
		return this.pessoasFisica;
	}
	public EstadoCivilBean setPessoasFisica(Collection<PessoaFisicaBean> pessoasFisica){
		this.pessoasFisica = pessoasFisica;
		
		return this;
	}
}