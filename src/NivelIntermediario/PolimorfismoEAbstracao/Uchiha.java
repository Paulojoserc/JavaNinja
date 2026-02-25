package NivelIntermediario.PolimorfismoEAbstracao;

public class Uchiha extends Ninja {

    //Sobreescrever o método da classe Ninja
    @Override
    public void habilidadeEspecial() {

        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha");
    }

    //Sobreescrevendo a interface
    @Override
    public void estrategiaNinjaDeBatalhaNinja() {

        System.out.println("Meu nome é "+nome+" Essa é minha estratégia de combate");
    }
}
