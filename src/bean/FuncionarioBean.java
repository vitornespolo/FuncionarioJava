package bean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import model.Funcionario;



@LocalBean
@Stateless
public class FuncionarioBean extends AbstractBeanImpl<Funcionario>{

	@Override
	public Class<Funcionario> getClasse() {
		return Funcionario.class;
	}

	@Override
	public List<Funcionario> buscarTodos() throws Exception {
		String sql = "Select a From Autor a ";
		Query query = entity.createQuery(sql);
		return query.getResultList();
	}
	
	public List<Funcionario> pesquisar(String nome)throws Exception {
		String sql = "Select c From Autor c where upper(c.nome) like :nome ";
		Query query = entity.createQuery(sql);
		query.setParameter("nome", "%"+nome.trim().toUpperCase()+"%");
		return query.getResultList();
	}
}