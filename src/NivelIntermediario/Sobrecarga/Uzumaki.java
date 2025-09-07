package NivelIntermediario.Sobrecarga;

public class Uzumaki extends Ninja {
    public Uzumaki() {
    super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    //Sobreescrever o método da classe Ninja
    @Override
    public void habilidadeEspecial() {

        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki");
    }


    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é a minha estrategia de combate");
    }
}
