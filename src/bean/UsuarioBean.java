//package bean;
//
//import java.util.List;
//
//import javax.ejb.LocalBean;
//
//import javax.ejb.Stateless;
//import javax.persistence.Query;
//
//import model.Usuario;
//
//@LocalBean
//@Stateless
//public class UsuarioBean extends AbstractBeanImpl<Usuario> {
//
//	@Override
//	public Class<Usuario> getClasse() {
//		return Usuario.class;
//	}
//	
//	public Usuario logar(String email,String senha)throws Exception {
//		String sql = "Select u From Usuario u where u.email = :email "
//				+ " and u.senha = :senha ";
//		Query query = entity.createQuery(sql);
//		query.setParameter("email", email);
//		query.setParameter("senha", senha);
//		List<Usuario> usuarios = query.getResultList();
//		if (usuarios.isEmpty()) {
//			return null;
//		}
//		return usuarios.get(0);
//	}
//
//	@Override
//	public List<Usuario> buscarTodos() throws Exception {
//		String sql = "Select c From Usuario c ";
//		Query query = entity.createQuery(sql);
//		return query.getResultList();
//	}
//	
//	public List<Usuario> pesquisar(String nome)throws Exception {
//		String sql = "Select u From Usuario u where upper(u.nome) like :nome order by u.nome ";
//		Query query = entity.createQuery(sql);
//		query.setParameter("nome", "%"+ nome.trim().toUpperCase()+"%");
//		return query.getResultList();
//	}
//}