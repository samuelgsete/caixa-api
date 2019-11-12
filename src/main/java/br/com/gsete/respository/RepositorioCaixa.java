package br.com.gsete.respository;

import org.apache.deltaspike.data.api.FullEntityRepository;
import org.apache.deltaspike.data.api.Repository;

import br.com.gsete.models.Caixa;

@Repository
public interface RepositorioCaixa extends FullEntityRepository<Caixa, Long> {
    
}