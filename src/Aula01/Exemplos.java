package Aula01;


public class Exemplos {
    public static void main(String[] args) {
   
    
    }
    
    public static double calcularmedia (double[] notas){
        double soma = 0;
        int tam_vetor = notas.length;
        for (int i = 0; i < tam_vetor; i++){
            soma += notas[i];
        }
        
        double media = soma / tam_vetor;
        return media;
    }
}
