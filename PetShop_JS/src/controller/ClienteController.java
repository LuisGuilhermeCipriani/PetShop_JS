/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDao;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author cipri
 */
public class ClienteController {
    private Cliente cliente;
    private ClienteDao clienteDao;
    
    public ClienteController() {
        cliente = new Cliente();
        clienteDao = new ClienteDao();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaClientes() {
        return clienteDao.buscar();
    }

    
    public void cadastrarCliente(){
        clienteDao.inserir(cliente);
    }
    
    public Cliente buscaCliente(String nome){
        nome.toLowerCase().trim();
        for(Cliente cliente: clienteDao.buscar()){
            if(nome.equals(cliente.getNome().toLowerCase().trim())){
                return cliente;
            }
        }
        return null;
    }
    
}
