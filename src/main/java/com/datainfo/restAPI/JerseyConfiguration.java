package com.datainfo.restAPI;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.datainfo.restAPI.controller.UsuarioExternoController;

@Configuration
@ApplicationPath("rest")
public class JerseyConfiguration extends ResourceConfig {
	public JerseyConfiguration() {
		
	}
	
	@PostConstruct
	public void setUp() {
		register(UsuarioExternoController.class);
		register(GenericExceptionMapper.class);
	}
}
