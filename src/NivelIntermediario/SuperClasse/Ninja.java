package NivelIntermediario.SuperClasse;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //Métodos geral! Todos os ninjas vão ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ nome + " e esse é meu ataque especial");
    }

    //Sobrescrevendo o método da interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é: "+nome + " Essa é minha estrategia de combate");
    }

    //Sobrecarga de método - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: "+nome+" Essa é minha inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: "+qi+" e você é um genio");
        } else if (qi>=130) {
            System.out.println("Seu QI é: "+qi+" e você um ninja promissor");
        }else {
            System.out.println(" Seu QI é; "+qi+" e você precisa treinar mais seus estrategia." );
        }
    }
}
