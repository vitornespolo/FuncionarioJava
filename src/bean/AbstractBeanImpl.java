package bean;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.BaseEntity;

public abstract class AbstractBeanImpl <T extends BaseEntity> implements AbstractBean<T> {
	
	@PersistenceContext(unitName = "Funcionario")
	protected EntityManager entity;
	
	public T inserir(T obj) throws Exception{
		entity.persist(obj);
		entity.flush();
		return obj;	
	}
	
	public T alterar(T obj) throws Exception{
		T old = entity.find(getClasse(), obj.getCodigo());
		obj = entity.merge(obj);
		entity.flush();
		return obj;	
	}
	
	public T salvar(T obj) throws Exception{
		if (obj.getCodigo() == null ) {
			return inserir (obj);
		} else {
			return alterar(obj);
		}	
	}
	
	public abstract Class<T> getClasse();
	

	public Boolean deletar(T obj) throws Exception {
		T old = entity.find(getClasse(), obj.getCodigo());
		entity.remove(old);
		entity.flush();
		return true;
	} 
	
	public Boolean deletar(Long id) throws Exception {
		T old = entity.find(getClasse(), id);
		entity.remove(old);
		entity.flush();
		return true;
	}
	
	public T getPorCodigo(Long id)throws Exception {
		T obj = entity.find(getClasse(), id);
		return obj;
	}
	
	public abstract List<T> buscarTodos() throws Exception;
}


