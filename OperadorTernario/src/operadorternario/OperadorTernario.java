/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Ricardo
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        // se n1 for maior que n2 r = 0 se não r = 1
        r = (n1 > n2)?0:1;
        System.out.println(r);
        System.out.println("==-==-==-==-==-==-==-==-==-==-==-==-==-==-");
        int n10, n20, r1;
        n10 = 14;
        n20 = 18;
        // se n10 for maior que n20 r = 0 se não r1 = 1
        r1 = (n10 > n20)?n10:n20;
        System.out.println(r1);
        System.out.println("==-==-==-==-==-==-==-==-==-==-==-==-==-==-");
        // pode usar operações dentro da expressão
        int n100, n200, r2;
        n100 = 14;
        n200 = 8;
        // se n10 for maior que n20 r = 0 se não r2 = 1
        r2 = (n100 > n200)?n100 + n200:n100 - n200;
        System.out.println(r2);        
        
    }
    
}
