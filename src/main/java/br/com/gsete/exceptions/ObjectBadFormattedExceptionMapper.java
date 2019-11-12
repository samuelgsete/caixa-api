package br.com.gsete.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import br.com.gsete.exceptions.models.Erro;
import br.com.gsete.exceptions.models.ObjetcBadFormattedException;

@Provider
public class ObjectBadFormattedExceptionMapper implements ExceptionMapper<ObjetcBadFormattedException> {

    @Override
    public Response toResponse(ObjetcBadFormattedException ex) {
        return Response
                    .status(Status.BAD_REQUEST)
                    .entity(new Erro("ObjetcBadFormattedException", "400", "Objeto mal formatado", ex.getMessage()))
                    .type("application/json")
                    .build();
    }
}