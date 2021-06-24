/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola, Mundo!");
        int n, s = 0;
        int cont = 0;
        int contP = 0;
        int contI = 0;
        int mCem = 0;
        float media = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número:<br><em>(valor 0 interrompe.)</em></html>"));
            if (n != 0){
                s += n;
                cont++;
                if (n % 2 == 0){
                    contP++;
                }else{
                    contI++;
                }
                if (n >= 100){
                    mCem++;
                }
                media = s / cont;
            }
        }while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" +
                "<br>Total de Valores : " + cont +
                "<br>Total de Pares : " + contP +
                "<br>Total de Ímpares : " + contI +
                "<br>Total Acima de 100: " + mCem +
                "<br>Total Média : " + String.format("%.1f",media) +
                "<br>Somatório vale : "+ s + "</html>");
    }
    
}
