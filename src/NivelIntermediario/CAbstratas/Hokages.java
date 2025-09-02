package NivelIntermediario.CAbstratas;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

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

    public Hokages(double altura){
        this.altura = altura;
    }

    // Você consegue criar automaticamente os construtores com IntelJ
    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, double saldoBancario, int missoes, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.saldoBancario = saldoBancario;
        this.missoes = missoes;
        this.altura = altura;
    }
}
