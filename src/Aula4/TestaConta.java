
package Aula4;

public class TestaConta {
    public static void main(String[] args) {
        
        Conta objConta1 = new Conta();
        
        objConta1.setNomeTitular("vô");
        objConta1.setNumero(1);
        objConta1.setSaldo(1000);
        objConta1.setChequeEspecial(0);
        
        Conta objConta2 = new Conta();
        
        objConta1.setNomeTitular("pai");
        objConta1.setNumero(2);
        objConta1.setSaldo(1000);
        objConta1.setChequeEspecial(0.0);
        
        //sacar 400 reais
        double novoSaldo = objConta1.getSaldo() - 400;
        objConta1.setSaldo(novoSaldo);
        
        //transferir 100 reais da conta 1 para a conta 2
        double novoSaldoConta1 = objConta1.getSaldo() - 100;
        double novoSaldoConta2 = objConta2.getSaldo() + 100;
        
        objConta1.setSaldo(novoSaldoConta1);
        objConta2.setSaldo(novoSaldoConta2);
    }
    
}
