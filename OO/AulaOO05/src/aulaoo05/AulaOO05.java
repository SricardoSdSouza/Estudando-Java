/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaoo05;

/**
 *
 * @author Ricardo
 */
public class AulaOO05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco usuario1 = new ContaBanco();
        usuario1.setNumConta(0001);
        usuario1.setDono("Pancrascio");
        usuario1.abrirConta("CC");
        usuario1.depositar(100);
        
        usuario1.estadoAtual();
        
        
        ContaBanco usuario2 = new ContaBanco();
        usuario2.setNumConta(0002);
        usuario2.setDono("Emengarda");
        usuario2.abrirConta("CP");
        usuario2.depositar(500);
        usuario2.sacar(100);
        
        usuario2.estadoAtual();
    }
        
}
