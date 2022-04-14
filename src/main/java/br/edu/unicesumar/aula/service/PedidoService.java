package br.edu.unicesumar.aula.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.unicesumar.aula.domain.Pedido;
import br.edu.unicesumar.aula.repository.PedidoRepository;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido save(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public Page<Pedido> findAll(Pageable pageable){
        return pedidoRepository.findAll(pageable);
    }

    public Pedido findById(UUID uuid){
        return pedidoRepository.findById(uuid).orElse(null);
    }
}
