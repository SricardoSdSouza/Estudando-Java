/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaoo04;

/**
 *
 * @author Ricardo
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    /*
    // Este é o Metodo Construtor mais simples
    public Caneta(){
        this.tampar();
        this.cor = "Azul";
        
    }*/
    // Um construtor mais elaborado;
    public Caneta(String m,String c,float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        //System.out.println("MOdelo: "+ this.modelo);
        // usando os metodos getters
        System.out.println("Modelo: "+ this.getModelo());
        //System.out.println("Ponta: "+ this.ponta);
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+ this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
