package br.com.gsete.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/usuarios")
public class RecursoUsuario {

    public RecursoUsuario() { }

    @GET
    @Produces("text/plain")
    public String hello() {
		return "Bem vindo ao servico de usuarios do gsete!";
	}
}