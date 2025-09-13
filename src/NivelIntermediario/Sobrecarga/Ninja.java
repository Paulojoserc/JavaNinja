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

    //Sobreescrevendo o método da interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é: "+nome+" Essa é minha Estrategia de combate");
    }

    //Sobrecarga de método - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é: "+nome+" Essa é minha Inteligencia de combate");
    }
}
