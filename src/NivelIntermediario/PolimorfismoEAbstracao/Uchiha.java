package NivelIntermediario.PolimorfismoEAbstracao;

public class Uchiha extends Ninja {

    @Override
    public void habilidadeEspecial() {

        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha");
    }

    //Sobreescrevendo a interface
    @Override
    public void estrategiaNinjaDeBatalhaNinja() {
        System.out.println("Essa é a minha estrategia de combate");
    }
}
