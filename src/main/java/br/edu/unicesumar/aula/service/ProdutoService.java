package br.edu.unicesumar.aula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.edu.unicesumar.aula.domain.Produto;
import br.edu.unicesumar.aula.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto findById(Long id){
        return produtoRepository.findById(id).orElse(null);
    }

    public Page<Produto> findAll(Pageable pageable){
        return produtoRepository.findAll(pageable);
    }


}
