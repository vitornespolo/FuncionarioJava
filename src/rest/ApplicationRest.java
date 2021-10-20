package rest;

import java.util.HashSet;


import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import model.BaseEntityImpl;

@ApplicationPath("rest")
public class ApplicationRest extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> sets = new HashSet<Class<?>>();
		sets.add(CrossOriginFilter.class);	
		sets.add(FuncionarioWs.class);
		return sets;
	}
}