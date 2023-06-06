/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.time.Clock;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;

/**
 *
 * @author Pichau
 */
public class Main {
    
    public static void main(String[] args) {
    
    
        String nome = "Hasan";
        System.out.println(nome);
    
        Servico barba = new Servico(1, "barba", 30);
        System.out.println(barba.getDescricao());
        System.out.println(barba.getValor());
        
        Cliente cli = new Cliente(1, "Eunice", "Rua Tarambu", "54280285");
        System.out.println(cli.getNome());
        
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cli, barba, 30, "20/05/2023 10:30");
        System.out.println(agendamento.getCliente().getNome());
    }
    
    
    
    
    
}
