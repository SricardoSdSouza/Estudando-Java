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
public class Aluno extends Pessoa{
    // Atributos
    private int matricula;
    private String curso;
    
    //Metodos especiais
    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada!!");
        
    }
    // Metodos especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
