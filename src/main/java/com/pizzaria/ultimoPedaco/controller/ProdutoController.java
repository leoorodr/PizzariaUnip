package com.pizzaria.ultimoPedaco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pizzaria.ultimoPedaco.model.Produto;
import com.pizzaria.ultimoPedaco.model.bd.ProdutoDAO;

@Controller
public class ProdutoController {
    private ProdutoDAO produtoDAO;

    @Autowired
    public ProdutoController(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    @RequestMapping("/listaProdutos")
    public String listarProdutos(Model model) {
        List<Produto> listaDeProdutos = produtoDAO.listarProdutos();
        model.addAttribute("listaDeProdutos", listaDeProdutos);
        return "produtos"; // O nome da página de visualização, por exemplo, "produtos.html"
    }
}
