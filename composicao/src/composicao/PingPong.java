/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author Aluno
 */
public class PingPong implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Abrir ping-pong");  
    }

    @Override
    public void fechar() {
        System.out.println("Fechar jogo");
    }
    
}
