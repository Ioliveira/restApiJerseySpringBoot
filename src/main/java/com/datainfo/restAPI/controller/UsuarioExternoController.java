package com.datainfo.restAPI.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.datainfo.restAPI.model.UsuarioExterno;
import com.datainfo.restAPI.repository.UsuarioExternoRepository;

@Component
@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioExternoController {
	@Autowired
	private UsuarioExternoRepository usuarioRepository;	 
	 
	@GET
	public Response listarTodosUsuarios(){
		return Response.ok(usuarioRepository.findAll()).build();
	}
	   
	@Path("/{id}")
	@GET
	public Response obterUsuarioPorId(@PathParam("id") String cpf){
		return Response.ok(usuarioRepository.findById(cpf)).build();
	}
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response incluirUsuario(UsuarioExterno usuario) throws Exception {
    	if (usuario != null && usuarioRepository.existsById(usuario.getNumeroCpf())) {
			throw new Exception("Operação não realizada. Usuário já incluído");
		}
    	usuarioRepository.save(usuario);
        return Response.ok().build();
    }    

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response atualizarUsuario(@PathParam("id") String cpf, UsuarioExterno usuario) {
		usuarioRepository.save(usuario);
		return Response.noContent().build();
	}    
	
	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response atualizarParcialUsuario(@PathParam("id") String cpf, UsuarioExterno usuario) {
		usuarioRepository.save(usuario);
		return Response.noContent().build();
	}    
    
	@DELETE
	@Path("/{id}")
	public Response excluirUsuario(@PathParam("id") String cpf) {
		usuarioRepository.deleteById(cpf);;
		return Response.ok().build();
	}
}
