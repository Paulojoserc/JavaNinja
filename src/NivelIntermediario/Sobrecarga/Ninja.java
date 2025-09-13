package NivelIntermediario.Sobrecarga;

public abstract class Ninja implements EstrategiaDeBatalha {
//TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas , Rank
// TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    public Ninja() {
    }

    // Método existente: Primeiro método
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamado os novos atributos
    //Sobrecarga de métodos você não redeclarar o constutor só os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    //Métodos geral! Todos os ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    //Sobre escreve o método da interface
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + " Essa é minha Estrategia de combate");
    }

    //Inteligencia de combate - Método padrão
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " Essa é minha inteligencia de combate");
    }

    //Sobrecarga de método - Inteligencia de combate
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você um ninja promissor");
        } else {
            System.out.println(" Seu QI é; " + qi + " e você precisa treinar mais seus estrategia.");
        }
    }
    //Método sem @verride
    public void metodoProvisorio(){
        System.out.println("teste na classe Ninja");
    }
}
