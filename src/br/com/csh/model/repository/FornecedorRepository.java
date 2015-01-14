package br.com.csh.model.repository;

import br.com.csh.model.bean.FornecedorBean;

public class FornecedorRepository extends GenericRepository<FornecedorBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public FornecedorRepository() {
		super(FornecedorBean.class);
	}
}