
package Aula4;
public class Pessoa {
    private String cidade;
    private String nome;
    private int idade;
    private boolean aluno;

    public String getCidade() {
        return cidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isAluno() {
        return aluno;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAluno(boolean aluno) {
        this.aluno = aluno;
    }
    
    
    
    public String retornarNome(){
        return nome;
    }
    public void modificarNome(String info){
        nome = info;
    }
    
    public int retornarIdade(){
        return idade;
    }
    public void modificarIdade(int info){
        idade = info;
    }
    
    public String retornarCidade(){
        return cidade;
    }
    public void modificarCidade(String info){
        cidade = info;
    }
    
    public boolean retornarAluno(){
        return aluno;
    }
    public void modificarAluno(boolean info){
        aluno = info;
    }
    
    public String imprimir(){
        return nome + "(" + idade + "), " + cidade;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome;
    }
    
}
