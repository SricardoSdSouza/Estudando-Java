/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Ricardo
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero morcego = new Mamifero();
        Lobo lobinho = new Lobo();
        Cachorro cao = new Cachorro();
        
        
        //morcego.emitirSom();
        //lobinho.emitirSom();
        //cao.emitirSom();
        cao.reagir("Ola!");
        cao.reagir("Vai apanhar!");
        cao.reagir(11, 45);
        cao.reagir(21, 00);
        cao.reagir(true);
        cao.reagir(false);
        cao.reagir(2, 12.5f);
        cao.reagir(17, 4.5f);
    }
    
}
