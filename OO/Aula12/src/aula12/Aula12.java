/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Ricardo
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru cang = new Canguru();
        Cachorro cao = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tata = new Tartaruga();
        GoldFish peixe = new GoldFish();
        Arara ave = new Arara();
        
        
        /*a.setPeso(.39f);
        a.setCorPena("branca");
        a.setIdade(1);
        a.setMembros(2);
        a.alimentar();
        a.locomover();
        a.emitirSom();*/
        System.out.println("=========================");
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.setIdade(2);
        m.setMembros(4);
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println("=========================");
       /* p.setCorEscama("Dourada");
        p.setPeso(.13f);
        p.setIdade(2);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();*/
       cang.locomover();
       cao.locomover();
       cao.emitirSom();
       
       
    }
    
}
