package com.example.projeto3.service;

import com.example.projeto3.entity.ClienteEntity;
import com.example.projeto3.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<ClienteEntity> listarTodosClientes() {
        return repository.findAll();
    }

    public void salvar(ClienteEntity cliente) {
        repository.save(cliente);
    }

    public void atualizarCliente(Long id, ClienteEntity cliente) {
        cliente.setId(id);
        repository.save(cliente);
    }

    public void excluirCliente(Long id) {
        repository.deleteById(id);
    }
}