/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancoexe05;

/**
 *
 * @author Ricardo
 */
public class ContaBanco {
    // Declarando os atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("=*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*$*=");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: " + this.getStatus()); 
    }   
    
// declarando os métodos
    public void abrirConta(String t){
        this.setTipo(t);//poderia declarar this.tipo = t
        this.setStatus(true);
        if ("CC".equals(t)){
            //poderia declarar this.saldo = 50
            this.setSaldo(50);
        }else if ("CP".equals(t)){
            //poderia declarar this.saldo = 150
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!"); 
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){// testa se existe saldo
             System.out.println("Conta não pode ser fechada, ainda tem saldo!");
        }else if (this.getSaldo() < 0){// testa se existe débito saldo negativo
             System.out.println("Existe um Débito em sua conta, não pode ser fechada!");
        }else{
             this.setStatus(false);
             System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            // poderia this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("ERRO! conta esta fechada");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            } 
        }else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso"+ this.getDono());
            }else{
                System.out.println("Impossível pagar uma conta fechada!!");
            }
    }
     //Metodo construtor criado
    public ContaBanco(){
         this.saldo = 0;
         this.status = false;
    }
//  Métodos especiais  
    private int getNumConta() {
        return this.numConta;
    }

    private String getTipo() {
        return this.tipo;
    }

    private String getDono() {
        return this.dono;
    }

    private float getSaldo() {
        return this.saldo;
    }

    private boolean getStatus() {
        return this.status;
    }

    public void setNumConta(int n) {
        this.numConta = n; 
    }

    void setDono(String d) {
        this.dono = d;
    }

    private void setSaldo(float s) {
        this.saldo = s;
    }

    private void setTipo(String t) {
        this.tipo = t;
    }

    private void setStatus(boolean b) {
        this.status = b;
    }  
       
}
