package br.com.gsete.services;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.gsete.exceptions.models.ObjetcBadFormattedException;
import br.com.gsete.models.Caixa;
import br.com.gsete.respository.RepositorioCaixa;

public class ServicoCaixa {

    @Inject
    private RepositorioCaixa repositorio;

    @Transactional
    public void salvarOuAtualizar(Caixa caixa) throws ObjetcBadFormattedException {
        if(caixa != null) {
            repositorio.merge(caixa);
        }else {
            throw new ObjetcBadFormattedException("Objeto está nulo ou mal formatado");
        }
    }
}