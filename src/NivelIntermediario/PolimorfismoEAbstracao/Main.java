package NivelIntermediario.PolimorfismoEAbstracao;

public class Main {
    public static void main(String[] args) {

        //Não da para criar uma classe Ninja ninja =  new Ninja
        /*
        * Ninja ninjaGenerico = new Ninja
        * ninjaGenerico = "NinjaDoido"
        * */

        //Objeto uzumaki
        Uzumaki naruto =  new Uzumaki();
        naruto.nome =  "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaNinjaDeBatalhaNinja();

        //Objeto Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
    }
}
