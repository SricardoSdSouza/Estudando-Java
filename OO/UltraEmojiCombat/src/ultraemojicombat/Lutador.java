/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author Ricardo
 */
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //Métodos Públicos
    public void apresentar(){
        System.out.println("***===============================================***");
        System.out.println("CHEGOU A HORA!!Apresentamos o Lutador "+ this.getNome());
        System.out.println("***===============================================***");
        System.out.println("Diretamente de "+ this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e "+ this.getAltura()+"m");
        System.out.println("Pesando "+ this.getPeso()+ "Kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas()+ " Derrotas e");
        System.out.println(this.getEmpates()+ " empates!");
        
    }
    public void status(){
        System.out.println(this.getNome()+ " é um peso "+ this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " Vezes!");
        System.out.println("Perdeu " + this.getDerrotas() + " Vezes!");
        System.out.println("Empatou " + this.getEmpates() + " Vezes!");
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
        // poderia usar assim:
        //this.vitorias = this.vitorias + 1;
    }
    public void pederLuta(){
        this.setDerrotas(this.getDerrotas() + 1);      
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);       
    }
    // Métodos especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        //this.peso = pe;//como set peso que esta acessando a categoria não pode ser usado sem o setPeso();
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }else if (this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
