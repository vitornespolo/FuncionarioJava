package bean;

import model.BaseEntity;

public interface AbstractBean<T extends BaseEntity> {

	public T salvar(T obj)throws Exception;
	
	public T inserir(T obj)throws Exception;
	
	public T alterar(T obj)throws Exception;
	
	public Boolean deletar(T obj) throws Exception;

	public Boolean deletar(Long id) throws Exception;
}