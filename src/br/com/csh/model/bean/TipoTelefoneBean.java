package br.com.csh.model.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="TipoTelefone")
public class TipoTelefoneBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tipoTelefoneID;
	@Column(name="descricao", length=20, nullable=false, unique=true)
	private String descricao;
	
	public TipoTelefoneBean() {
		super();
	}

	public TipoTelefoneBean(int tipoTelefoneID, String descricao) {
		super();
		this.tipoTelefoneID = tipoTelefoneID;
		this.descricao = descricao;
	}
	
	public int getTipoTelefoneID() {
		return tipoTelefoneID;
	}
	public void setTipoTelefoneID(int tipoTelefoneID) {
		this.tipoTelefoneID = tipoTelefoneID;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}