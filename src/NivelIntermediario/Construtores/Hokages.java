package NivelIntermediario.Construtores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokages() {
    //Construtor vazio, sem argumentos
    }

    // Criar um construtor com argumento
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }
//All args construtor = Contrutor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
