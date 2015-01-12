package br.com.csh.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Profissao")
public class ProfissaoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int profissaoID;
	@Column(name="descricao", length=40, nullable=false, unique=true)
	private String descricao;
	
	public ProfissaoBean() {
		super();
	}
	
	public ProfissaoBean(int profissaoID, String descricao) {
		super();
		this.profissaoID = profissaoID;
		this.descricao = descricao;
	}

	public int getProfissaoID() {
		return profissaoID;
	}
	public void setProfissaoID(int profissaoID) {
		this.profissaoID = profissaoID;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}