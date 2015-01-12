package br.com.csh.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="QuartoCategoria")
public class QuartoCategoriaBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int quartoCategoriaID;
	@Column(name="descricao", length=20, nullable=false, unique=true)
	private String descricao;
	
	public QuartoCategoriaBean() {
		super();
	}
	
	public QuartoCategoriaBean(int quartoCategoriaID, String descricao) {
		super();
		this.quartoCategoriaID = quartoCategoriaID;
		this.descricao = descricao;
	}

	public int getQuartoCategoriaID() {
		return quartoCategoriaID;
	}
	public void setQuartoCategoriaID(int quartoCategoriaID) {
		this.quartoCategoriaID = quartoCategoriaID;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}