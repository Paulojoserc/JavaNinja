package NivelIntermediario.SuperClasse;

public class MainSuperClasse {
    public static void main(String[] args) {

        //Objeto uzumaki
        Uzumaki naruto =  new Uzumaki();
        naruto.nome =  "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaNinjaDeBatalhaNinja();

        //Objeto Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();

        //Objeto Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27);
        itachi.habilidadeEspecial();
    }
}
