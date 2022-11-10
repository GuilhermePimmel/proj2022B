
package Aula03;

public class Exercicios2 {
    
    public static void main(String[] args) {
        double lado1 = Entrada.leiaInt("Insira o primeiro lado");
        double lado2 = Entrada.leiaInt("Insira o segundo lado");
        
        

    }
    
       public static void area(double n1, double n2){
       double area = n1 * n2;
       if(n1 == n2){
           System.out.println("área do quadrado é " + area);
       }else{
           System.out.println("área do retângulo é " + area);
       }
      
    }

    
}
