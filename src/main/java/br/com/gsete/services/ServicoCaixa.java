package br.com.gsete.services;

import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.gsete.exceptions.models.ObjetcBadFormattedException;
import br.com.gsete.models.Caixa;
import br.com.gsete.respository.RepositorioCaixa;

public class ServicoCaixa {

    @Inject
    private RepositorioCaixa repositorio;

    public List<Caixa> todosOsCaixas() {
        return repositorio.findAll();
    }

    public Caixa buscarPorId(Long id) {
        if(id > 0) {
            return repositorio.findBy(id);
        }
        return null;
    }

    @Transactional
    public void salvarOuAtualizar(Caixa caixa) throws ObjetcBadFormattedException {
        if(caixa != null) {
            caixa.atualizarSaldo();
            repositorio.save(caixa);
        }else {
            throw new ObjetcBadFormattedException("Objeto está nulo ou mal formatado");
        }
    }

    @Transactional
    public void removerCaixa(Long id) {
        if(id > 0) {
            repositorio.remove(buscarPorId(id));
        }
    }
}