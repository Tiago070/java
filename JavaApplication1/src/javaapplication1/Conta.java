
package javaapplication1;

public class Conta {
    private double saldo;
    private String nome;
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    //alt+insert - gera get e set automático
    /**
     * Acumula no saldo um valor x mais 10%
     * @param valor double - indica o valor a ser depositado
     * @param porcentagem
     */
    /*public void depositar(double valor){
        this.saldo = this.saldo + valor + (valor*0.1);
    }*/
    
    public void depositar2(double valor, double porcentagem){
        this.saldo = this.saldo + valor + (valor*porcentagem/100);
    }
   
}
