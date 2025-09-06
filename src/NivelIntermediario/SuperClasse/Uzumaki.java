package NivelIntermediario.SuperClasse;

public class Uzumaki extends Ninja {

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " esse é meu ataque Uzumaki, um ataque de ar");
    }

    @Override
    public void estrategiaNinjaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + " Essa é minha estrategia de combate");
    }
}
