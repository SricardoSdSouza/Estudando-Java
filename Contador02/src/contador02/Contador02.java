/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador02;

/**
 *
 * @author Ricardo
 */
public class Contador02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while(cc<10){
            cc++;
            if (cc == 4 || cc == 6 || cc == 8){
                continue;// continua o loop, voltando para o while
            }
            if (cc == 9){//interrompe e não continua o while
                break;
            }
            
            System.out.println("Cambalhota "+ (cc));
            
        }
    }
    
}
