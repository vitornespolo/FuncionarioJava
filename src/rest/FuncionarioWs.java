package rest;

import java.util.List;

import javax.ejb.EJB;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bean.FuncionarioBean;
import model.Funcionario;

@Path("funcionario")
public class FuncionarioWs {

	@EJB
	private FuncionarioBean funcionarioBean;

	@POST
	@Path("salvar")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvar(Funcionario funcionario) {
		try {
			funcionario = funcionarioBean.salvar(funcionario);
			return Response.ok(funcionario).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}

	@DELETE
	@Path("{codigo}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletar(@PathParam("codigo") Long codigo) {
		try {
			funcionarioBean.deletar(codigo);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}

	@GET
	@Path("{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getPorID(@PathParam("codigo") Long codigo) {
		try {
			Funcionario autor = funcionarioBean.getPorCodigo(codigo);
			return Response.ok(autor).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response buscarTodos() {
		try {
			List<Funcionario> lista = funcionarioBean.buscarTodos();
			return Response.ok(lista).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}

	@Path("nome")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisar(String nome) {
		try {
			List<Funcionario> lista = funcionarioBean.pesquisar(nome);
			return Response.ok(lista).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}

}
