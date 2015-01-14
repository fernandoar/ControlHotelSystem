package br.com.csh.model.repository;

import br.com.csh.model.bean.PessoaBean;

public class PessoaRepository extends GenericRepository<PessoaBean, Integer> {
	private static final long serialVersionUID = 1L;
	
	public PessoaRepository() {
		super(PessoaBean.class);
	}
}