package rest;

import javax.ws.rs.container.ContainerRequestContext;

import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;


@Provider
public class CrossOriginFilter implements ContainerResponseFilter{

	public void filter(ContainerRequestContext requestContext, 
			ContainerResponseContext response) {
		response.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
        response.getHeaders().putSingle("Access-Control-Allow-Methods", 
        		"GET, POST, PUT, DELETE, OPTIONS, TRACE, HEAD");
        response.getHeaders().putSingle("Access-Control-Allow-Headers", 
        		"Content-Type, accept");		
	}
}