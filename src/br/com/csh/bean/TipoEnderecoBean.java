package br.com.csh.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="TipoEndereco")
public class TipoEnderecoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tipoEnderecoID;
	@Column(name="descricao", length=20, nullable=false, unique=true)
	private String descricao;
	
	public TipoEnderecoBean(){
		super();
	}
	
	public TipoEnderecoBean(int tipoEnderecoID, String descricao) {
		super();
		this.tipoEnderecoID = tipoEnderecoID;
		this.descricao = descricao;
	}

	public int getTipoEnderecoID() {
		return tipoEnderecoID;
	}
	public void setTipoEnderecoID(int tipoEnderecoID) {
		this.tipoEnderecoID = tipoEnderecoID;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}