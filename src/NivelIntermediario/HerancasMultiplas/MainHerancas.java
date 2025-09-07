package NivelIntermediario.HerancasMultiplas;

public class MainHerancas {
    public static void main(String[] args) {

        //Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.shariganAtivado();

        //Obj Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.shariganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageAtivo();
    }
}
