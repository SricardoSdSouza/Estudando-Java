/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author Ricardo
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totpag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos especiais

    //@Override
    public String detalhes() {
        return "Livro{" + "titulo= " + titulo + ",\n autor= " + autor + ",\n totpag= " 
               + totpag + ",pagAtual= " + pagAtual + ",\n aberto= " + aberto 
               + ",\n leitor= " + leitor.getNome() + ", idade = " + leitor.getIdade()
               + ",Sexo = "+ leitor.getSexo() +'}';
    }

    // Construtor
    public Livro(String titulo, String autor, int totpag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpag = totpag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpag() {
        return totpag;
    }

    public void setTotpag(int totpag) {
        this.totpag = totpag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totpag){
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
 
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPg() {
        this.pagAtual--;
    }
}
