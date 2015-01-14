package br.com.csh.model.repository;

import br.com.csh.model.bean.EstadoBean;

public class EstadoRepository extends GenericRepository<EstadoBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public EstadoRepository() {
		super(EstadoBean.class);
	}
}