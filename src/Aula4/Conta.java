
package Aula4;

public class Conta {
    
    private String nomeTitular;
    private int numero;
    private double saldo;
    private double chequeEspecial;
    
    public Conta(){
        
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public boolean Sacar(double valor){
        if(this.saldo + this.chequeEspecial < valor){
            System.out.println("pobre");
            return false;
        }else{
        this.saldo -= valor;
        return true;
        }
     }
    
    public void Depositar(double valor){
        
        this.saldo += valor;
    }
    
    public boolean transferir(double valor, Conta objContaDestino){
        if(this.saldo + this.chequeEspecial > valor){
        this.saldo -= valor;
        objContaDestino.saldo += valor;
        return true;
        }else{
            System.out.println("pobre");
            return false;
        }
    }
    

    public Conta(String nomeTitular, int numero, double saldo, double chequeEspecial) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }
    
}
