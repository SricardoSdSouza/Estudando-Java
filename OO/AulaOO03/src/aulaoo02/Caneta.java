/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaoo02;

/**
 *
 * @author Ricardo
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    //trocando a visibilidade de protected para private
    private boolean tampada;
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar estou fechada!");
        }else{
            System.out.println("Agora posso Rabiscar!");
        }
        
    }
    //trocando a visibilidade de protected para public
    public void tampar(){
        this.tampada = true;
        
    }
    //trocando a visibilidade de protected para public
    public void destampar(){
        this.tampada = false;
        
    }
    
}
