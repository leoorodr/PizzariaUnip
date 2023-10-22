package com.pizzaria.ultimoPedaco.model.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.pizzaria.ultimoPedaco.model.Produto;

@Component
public class ProdutoDAOImpl implements ProdutoDAO {
    ConnectionFactory connectionFactory;

    public ProdutoDAOImpl() {
        connectionFactory = new ConnectionFactory();
    }

    @Override
    public List<Produto> listarProdutos() {
        List<Produto> lista = new ArrayList<Produto>();
        try {
            Connection connection = connectionFactory.getConnection();
            String query = "SELECT * FROM produto"; // Consulta para selecionar todos os produtos

            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                lista.add(new Produto(
                    resultSet.getInt("id"),
                    resultSet.getString("nome"),
                    resultSet.getString("descricao"),
                    resultSet.getFloat("valor"),
                    resultSet.getString("tipo")
                ));
            }

            connection.close();
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
