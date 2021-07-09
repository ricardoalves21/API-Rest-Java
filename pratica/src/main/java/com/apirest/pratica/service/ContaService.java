package com.apirest.pratica.service;

import com.apirest.pratica.exception.ContaNotFoundException;
import com.apirest.pratica.models.Conta;
import com.apirest.pratica.repository.ContaRepository;
import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class ContaService {

    private final ContaRepository contaRepository;

    public List<Conta> listarContas() {
        return this.contaRepository.findAll();
    }

    public Conta listarContaPeloId(long id) {
        return this.contaRepository
                .findById(id)
                .orElseThrow(() -> new ContaNotFoundException(id));
    }

    @Transactional
    public Conta salvaConta(Conta conta) {
        return this.contaRepository.save(conta);
    }

    @Transactional
    public void deletaConta(long id) {
        try {
            this.contaRepository.deleteById(id);
            this.contaRepository.flush();
        } catch (EmptyResultDataAccessException e) {
            throw new ContaNotFoundException(id);
        }
    }

    @Transactional
    public Conta atualizaConta(Conta conta) {
        return this.contaRepository.save(conta);
    }
}
