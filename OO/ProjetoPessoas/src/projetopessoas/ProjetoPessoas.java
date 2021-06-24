/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author Ricardo
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setIdade(23);
        p2.setNome("Maria");
        p2.setIdade(33);
        p3.setNome("Cláudio");
        p3.setIdade(29);
        p4.setNome("Fabiana");
        p4.setIdade(32);
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        // forçando erros
        //p1.receberAumento(550.20f);// so quem pode receber aumento é professor p3
        //p2.mudarTrabalho();// so quem pode mudar trabalho é funcionario P4
        //p4.cancelarMatricula();// so quem pode cancelar matricula é aluno p2
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
