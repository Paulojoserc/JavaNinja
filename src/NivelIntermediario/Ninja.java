package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;


    /*
    * Método String vai ter que retornar uma String
    * */
    public String EuSouUmNinja(){
        return "Eu sou um ninja";
    }

    /*
     * Método Int vai ter que retornar uma String
     * */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
