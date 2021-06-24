/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *@author Ricardo
 *@version 1.0
 * @since 16/09/2020
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
       /* int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é = " + m);
        System.out.println("++++++++++++++++++++++");
        // exemplificando o incremento da variável
        int numero = 5;
        numero ++;
        System.out.println(numero);
        System.out.println("++++++++++++++++++++++");
        //usando o decremento
        numero --;
        System.out.println(numero);
        System.out.println("++++++++++++++++++++++");
        //int num = 5;
        //int valor = 5 + num++; // vaifazer toda a operação e somar 1 ao numero
        //System.out.println(valor);
        //System.out.println(num);
        System.out.println("++++++++++++++++++++++");
        int num = 5;
        int valor = 5 + ++num;
        System.out.println(valor);*/
       //Fazendo arredondamentos
       float v = 8.9f;
       //int aredondado = (int) Math.floor(v);
       //System.out.println(aredondado);
       System.out.println("=============================");
       int aredondado = (int) Math.ceil(v);
       System.out.println(aredondado);
       System.out.println("=============================");
       float v1 = 8.4f;
       int aredondado1 = (int) Math.round(v1);
       System.out.println(aredondado1);
       System.out.println("======usando Random==============");
       double ale = Math.random();
       System.out.println(ale);
       //estabelecendo limite de valores neste caso 5 a 10
       int n = (int) (5 + ale * (10-5));
       System.out.println(n);
       System.out.println("====usando Random com intervalo=====");
       //estabelecendo limite de valores neste caso 15 a 50
       int n1 = (int) (15 + ale * (50-15));
       System.out.println(n1);
       
    }
    
}
