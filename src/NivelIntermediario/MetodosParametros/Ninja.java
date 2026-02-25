package NivelIntermediario.MetodosParametros;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    /*
     *O método VOID não retorna valor nenhum!
     * */
    public void SharinganAtivado() {
        System.out.println("I sharigan Ativou! ");
    }

    /*
     * Método String vai ter que retornar uma String
     * */
    public String EuSouUmNinja() {
        return "Eu sou um ninja";
    }

    /*
     * Método Int vai ter que retornar uma String
     * */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
