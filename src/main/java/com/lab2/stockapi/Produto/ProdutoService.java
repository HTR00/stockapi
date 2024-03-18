package com.lab2.stockapi.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getAllProducts() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> getProductsById(Long Id){
        return produtoRepository.findById(Id);

    }

    public Produto createProduct(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Optional<Produto> updateProduct (Long id, Produto updatedProduct) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if (produto.isPresent()) {
            updatedProduct.setId(id);
            return Optional.of(produtoRepository.save(updatedProduct));
        }
        return Optional.empty();
    }

    public void deleteProduct(Long id) {produtoRepository.deleteById(id);}
    
}
