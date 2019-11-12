package br.com.gsete.api.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
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

    @GET
    @Produces("application/json")
    public Response todosOsCaixar() {
        return Response
                .ok()
                .entity(servico.todosOsCaixas())
                .build();
    }

    @POST
	@Consumes("application/json")
    public Response salvarCaixa(Caixa caixa) throws ObjetcBadFormattedException {
        servico.salvarOuAtualizar(caixa);
        return Response.status(Status.CREATED).build();
    } 
    
    @PUT
    @Consumes("application/json")
    public Response atualizarCaixa(Caixa caixa) throws ObjetcBadFormattedException {
        servico.salvarOuAtualizar(caixa);
        return Response
            .status(Status.OK)
            .build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes("application/json")
    public Response removerCaixa(@PathParam("id") Long id) {
        servico.removerCaixa(id);
        return Response
            .status(Status.NO_CONTENT)
            .build();
    }
}