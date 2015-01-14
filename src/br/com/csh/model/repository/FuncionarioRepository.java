package br.com.csh.model.repository;

import br.com.csh.model.bean.FuncionarioBean;

public class FuncionarioRepository extends GenericRepository<FuncionarioBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public FuncionarioRepository() {
		super(FuncionarioBean.class);
	}
}