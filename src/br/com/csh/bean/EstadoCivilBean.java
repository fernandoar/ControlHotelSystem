package br.com.csh.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="EstadoCivil")
public class EstadoCivilBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int estadoCivilID;
	@Column(name="descricao", length=20, nullable=false, unique=true)
	private String descricao;
	
	public EstadoCivilBean() {
		super();
	}
	
	public EstadoCivilBean(int estadoCivilID, String descricao) {
		super();
		this.estadoCivilID = estadoCivilID;
		this.descricao = descricao;
	}
	
	public int getEstadoCivilID() {
		return estadoCivilID;
	}
	public void setEstadoCivilID(int estadoCivilID) {
		this.estadoCivilID = estadoCivilID;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}