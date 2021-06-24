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
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    
    public void estadoAtual(){
        System.out.println("*=================================*");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    // Metodo construtor:
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC" == t){
            this.setSaldo(50);
        }else if ("CP" == t){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }
    public void fecharConta(){
        if (this.getSaldo() >0){
            System.out.println("Conta não pode ser fechada, Ainda tem Saldo!");
        }else if(this.getSaldo() < 0){
            System.out.println("EXISTE Débito em sua conta, não pode ser fechada");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com Sucesso!!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){// testando se a conta esta aberta true
            this.setSaldo(this.getSaldo() + v);// pego o saldo e somo o valor de v
            System.out.println("Deposito realizado com sucesso!! na conta de " + this.getDono());
        }else{
            System.out.println("ERRRO! a conta esta fechada!! :( ");
        } 
    }
    public void sacar(float v){
        if(this.getStatus()){// testando se a conta esta aberta
            if (this.getSaldo() >= v){// testando se o saldo é maior que a solicitação para retirar
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque!!");
            }
        }else{
            System.out.println("Impossível sacar em uma conta fechada!!");
        }
    }
    public void pagarMensal(){
        int v =0;
        if(this.getTipo() == "CC"){
            v = 12;        
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso pelo" + this.getDono());
        }else{
            System.out.println("Impossível pagar com uma conta fechada!!!");
        }
    }
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean b) {
        this.status = b;
    }
    
    
}
