package com.pizzaria.ultimoPedaco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pizzaria.ultimoPedaco.model.Produto;
import com.pizzaria.ultimoPedaco.model.bd.ProdutoRepository;

@Controller
public class PedidoControler {
    private ProdutoRepository produtoRepository;


    @RequestMapping("/Pedidos")
    public ModelAndView listarProdutos(@ModelAttribute("produto") Produto produto) {
        ModelAndView modelAndView = new ModelAndView("produtos");
        //modelAndView.addObject("listaDeAlunos", alunoDAO.listarAlunos());
        modelAndView.addObject("listaDeProdutos", produtoRepository.findAll());
        return modelAndView;
    
    }
}
