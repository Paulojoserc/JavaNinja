package NivelIntermediario.PolimorfismoEAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;


    //Métodos geral! Todos os ninjas vão ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome + " e esse é meu ataque especial");
    }

    // Métodos abstratos é Obrigatório em todas às classes que herdar esta
    //public abstract void estrategiaNinjaDeBatalhaNinja();
}
