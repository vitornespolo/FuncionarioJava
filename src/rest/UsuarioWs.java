//package rest;
//
//import java.util.List;
//
//import javax.ejb.EJB;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//import bean.UsuarioBean;
//import model.Usuario;
//
//
//
//@Path("usuario")
//public class UsuarioWs {
//
//	@EJB
//	private UsuarioBean usuarioBean;
//	
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response salvar(Usuario usuario) {
//		try {
//			usuario = usuarioBean.salvar(usuario);
//			return Response.ok(usuario).build();
//		} catch (Exception e) {
//			return Response.serverError().entity(e.getLocalizedMessage()).build();
//		}
//	}
//	
//	@DELETE
//	@Path("{id}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response deletar(@PathParam("id") Long id) {
//		try {
//			usuarioBean.deletar(id);
//			return Response.ok().build();
//		} catch (Exception e) {
//			return Response.serverError().entity(e.getLocalizedMessage()).build();
//		}
//	}
//	
//	@GET
//	@Path("{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response getPorID(@PathParam("id")Long id) {
//		try {
//			Usuario user = usuarioBean.getPorCodigo(id);
//			return Response.ok(user).build();
//		}catch (Exception e) {
//			return Response.serverError().entity(e.getLocalizedMessage()).build();
//		}
//	}
//	@GET
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response buscarTodos() {
//		try {
//			List<Usuario> lista = usuarioBean.buscarTodos();
//			return Response.ok(lista).build();
//		} catch (Exception e) {
//			return Response.serverError().entity(e.getLocalizedMessage()).build();
//		}
//	}
//	@Path("nome")
//	@POST
//	@Produces(MediaType.APPLICATION_JSON) 
//	public Response pesquisar(String nome) {
//		try {
//			List<Usuario> lista = usuarioBean.pesquisar(nome);			
//			return Response.ok(lista).build();
//		} catch (Exception e) {
//			return Response.serverError().entity(e.getLocalizedMessage()).build();
//		}
//	}
//}