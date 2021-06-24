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
public class AulaOO04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Caneta c1 = new Caneta(); // fazendo um construtro que recebe parâmetros
        //c1.setModelo("BIC");// como é atributo publico pode fazer a chamada c1.modelo = "BIC";
        //c1.setPonta(0.5f);
        Caneta c1 = new Caneta("Bic Crystal","Amarela", 0.4f);
        c1.status();
        Caneta c2 = new Caneta("Pen","Roxa",1.1f);
        c2.destampar();
        c2.status();
        //System.out.println("Minha caneta é " + c1.getModelo() + " com ponta " + c1.getPonta());
    }
    
}
