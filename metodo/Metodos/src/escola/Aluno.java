package escola;

public class Aluno {

    String nome;
    int idade;

    public void mostrarDados(){
        System.out.println("seu nome : "+ getNome());
        System.out.println("sua idade é "+ getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

    

}