/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Animal;
import util.ConnectionFactory;

/**
 *
 * @author cipri
 */
public class AnimalDao {
    
    public void inserir(Animal animal){
        Connection conexao = new ConnectionFactory().conector();
        String sql = "INSERT INTO animal(id, nome, idade, tipo) VALUES(?, ?, ?, ?)"; //Query
        try{
            PreparedStatement stm = conexao.prepareStatement(sql);
            
            stm.setInt(1, animal.getId());
            stm.setString(2, animal.getNome());
            stm.setInt(3, animal.getIdade());
            stm.setString(4, animal.getTipo().name());
            
            stm.executeUpdate();
            
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao inserir Animal" + ex);
        }
    }
}
