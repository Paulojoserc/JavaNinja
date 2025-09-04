package NivelIntermediario.PolimorfismoEAbstracao;

public class MainPoliEAbstracao {
    public static void main(String[] args) {

        //Não da para criar uma classe Ninja ninja =  new Ninja

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
