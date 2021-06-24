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
public class AulaOO02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "Parker";
        c1.cor = " Azul";
        c1.ponta =0.5f;
        //c1.tampada = false;
        c1.tampar();
        //c1.carga = 0;
        c1.status();
        c1.rabiscar();
        //instanciado um novo objeto caneta
        Caneta c2 = new Caneta();
        c2.modelo = "bic";
        c2.ponta = 1f;
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
