/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import View.Agenda;
import controller.Helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.Servico;

/**
 *
 * @author Pichau
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    
    public void atualizaTabela() {
        //buscar lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        // exibir esta lista na View
        helper.preencherTabela(agendamentos);
        
    }
    
    public void atualizaCliente() {
        
        //buscar clientes do banco de dados 
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
    // exibiir clientes no combobox cliente
        helper.preencherCliente(clientes);
        
    }

    public void atualizaServico() {
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
    
    
         helper.preencherServico(servicos);
        
    }
    
   public void atualizaValor() {
      Servico servico = helper.obterServico();
      helper.setarValor(servico.getValor());
   }
    
}
