package NivelIntermediario.HerancasMultiplas;

public class Hatake extends Ninja implements SharingaInterface, AnbuInterface, HokageInterface {
    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }


    public void shariganAtivado() {
        System.out.println(nome + ": Ativou o Sharinga");
    }

    public void hokageAtivo(){
        System.out.println(nome +": eu fui um Hokage");
    }
    public void ninjaDeElite() {
        System.out.println(nome+ ": Eu sou um ninja de elite da Anbu");
    }
}
