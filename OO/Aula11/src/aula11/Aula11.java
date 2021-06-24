/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Ricardo
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // Instanciando um objeto visitante
     Visitante v1 = new Visitante();
     v1.setNome("Andre");
     v1.setIdade(23);
     v1.setSexo("M");
     System.out.println(v1.toString());
     System.out.println("============================================");
     Aluno a1 = new Aluno();
     a1.setNome("Claudio");
     a1.setMatricula(1111);
     a1.setCurso("Informática");
     a1.setIdade(17);
     a1.setSexo("M");
     a1.pagarMensalidade();
     System.out.println(a1.toString());
     System.out.println("============================================");
     Bolsista b1 = new Bolsista();
     b1.setMatricula(1112);
     b1.setNome("Toinzinho");
     b1.setBolsa(12.5f);
     b1.setSexo("M");
     b1.pagarMensalidade();
     
    }
    
}
