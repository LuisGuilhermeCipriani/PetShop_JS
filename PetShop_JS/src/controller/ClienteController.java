/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author cipri
 */
public class ClienteController {
    private Cliente cliente;
    private List<Cliente> listaClientes;

    
    public ClienteController() {
        cliente = new Cliente();
        listaClientes = new ArrayList<Cliente>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    public void cadastrarCliente(){
        listaClientes.add(cliente);
    }
    
    public Cliente buscaCliente(String nome){
        nome.toLowerCase().trim();
        for(Cliente cliente: listaClientes){
            if(nome.equals(cliente.getNome().toLowerCase().trim())){
                return cliente;
            }
        }
        return null;
    }
    
}
