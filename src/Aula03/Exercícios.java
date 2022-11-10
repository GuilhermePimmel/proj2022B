
package Aula03;


public class Exercícios {
    public static void main(String[] args) {
     
        int horas = Entrada.leiaInt("Quantas horas inteiras você permaneceu");
        int minInf = Entrada.leiaInt("Quantos minutos você permaneceu");
        
        double min = minInf / 60.0;
        double somaHora = min + horas;
        
        
        System.out.println(somaHora);
        System.out.println(valorEstacionamento(somaHora));
    }
    
    public static double valorEstacionamento(double n1){
        double valor;
        double horaExtra;
        
        if(n1 <= 1.0){
            valor = 2.0;
        } 
        else {
            if(n1 <= 2.0){
                valor = 3.5;
            } 
            else{
                horaExtra = n1 - 2.0;
                valor = 3.5 + horaExtra;
            }
        }
        return valor;
    }
    


}