package com.pizzaria.ultimoPedaco.model.bd;


import java.util.List;
import com.pizzaria.ultimoPedaco.model.Produto;

public interface ProdutoDAO {
    List<Produto> listarProdutos();
}
