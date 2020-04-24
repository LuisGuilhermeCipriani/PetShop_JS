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
import model.Animal;
import model.Tipo;
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
    
    public List<Animal> buscar(){
        Connection conexao = new ConnectionFactory().conector();
        String sql = "SELECT * FROM animal"; //"SELECT id, tipo FROM animal"
        List<Animal> listaAnimais = new ArrayList<>();
        try{
            Statement stmt = conexao.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql); //Lista que vai guradar tudo do banco
            while(rs.next()){
                Animal animal = new Animal();
                animal.setId(rs.getInt("id"));
                animal.setNome(rs.getString("nome"));
                animal.setIdade(rs.getInt("idade"));
                animal.setTipo(Tipo.valueOf(rs.getString("tipo")));
                listaAnimais.add(animal);
            }
            return listaAnimais;
        }catch(SQLException ex){
            throw new RuntimeException("Erro ao buscar Animal" + ex);
        }
    }
}
