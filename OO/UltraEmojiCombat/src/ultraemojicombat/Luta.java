/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Ricardo
 */
public class Luta {
    // Atributos
    //private desafiado = Lutador();
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    // Metodos publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("##### DESAFIADO #####");
            this.desafiado.apresentar();
            System.out.println("##### DESAFIANTE #####");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// gerar 0, 1 ou 2
            System.out.println("======= RESULTADO DA LUTA =====");
            switch(vencedor){
                case 0://Empate
                    System.out.println("Empatou!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
   
                case 1://Desafiado vence
                    System.out.println("Vitoria do "+ this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.pederLuta();
                    break;
    
                case 2://Desafiante vence
                    System.out.println("Vitoria do "+ this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.print("======================");
        }else{
            System.out.println("A luta não pode acontecer!!");
        }
        
    }
// Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    
}
