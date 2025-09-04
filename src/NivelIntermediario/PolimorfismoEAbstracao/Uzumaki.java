package NivelIntermediario.PolimorfismoEAbstracao;

public class Uzumaki extends Ninja {

    //Sobreescrever o método da classe Ninja
    @Override
    public void habilidadeEspecial() {

        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki");
    }


    @Override
    public void estrategiaNinjaDeBatalhaNinja() {
        System.out.println("Essa é a minha estrategia de combate");
    }
}

