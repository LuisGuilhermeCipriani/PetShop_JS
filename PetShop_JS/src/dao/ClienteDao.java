/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import util.ConnectionFactory;

/**
 *
 * @author cipri
 */
public class ClienteDao {
    
    public void inserir(Cliente cliente){
        Connection conexao = new ConnectionFactory().conector();
        String sql = "INSERT INTO cliente(id, nome, cpf, idade) VALUES(?, ?, ?, ?)";
        try{
            PreparedStatement stm = conexao.prepareStatement(sql);
            
            stm.setInt(1, cliente.getId());
            stm.setString(2, cliente.getNome());
            stm.setString(3, cliente.getCPF());
            stm.setInt(4, cliente.getIdade());
            
            stm.executeUpdate();
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao inserir cliente" + ex);
        }
    }
    
    public List<Cliente> buscar(){
        Connection conexao = new ConnectionFactory().conector();
        String sql = "SELECT * FROM cliente";
        List<Cliente> lista = new ArrayList<>();
        try{
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCPF(rs.getString("cpf"));
                cliente.setIdade(rs.getInt("idade"));
                lista.add(cliente);
            }
            return lista;
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao buscar cliente" + ex);
        }
    }
}
