package br.com.gsete.api.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.gsete.exceptions.models.ObjetcBadFormattedException;
import br.com.gsete.models.Caixa;
import br.com.gsete.services.ServicoCaixa;

@Path("/caixa")
public class RecursoCaixa {

    @Inject
    private ServicoCaixa servico;

    public RecursoCaixa() { }

    @POST
	@Consumes("application/json")
    public Response salvarCaixa(Caixa caixa) throws ObjetcBadFormattedException {
        servico.salvarOuAtualizar(caixa);
        return Response.status(Status.CREATED).build();
    }  
}