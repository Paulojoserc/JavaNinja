package NivelIntermediario.Sobrecarga;

public class MainSobrecarga {
    public static void main(String[] args) {

        //Obj ninja não da pra ser criado por que é abstrato

        //Obj uzumaki

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //Obj uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha ","Sasuke Uchiha ", 17,50, NivelNinja.JOUNIN );
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        //Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27);
        itachi.habilidadeEspecial();

        //Obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();


    }
}
