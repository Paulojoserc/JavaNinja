package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar o ninja Naruto - Naruto é um OBJETO
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;


        // Criar ninja Sasuke Uchiha - Sasuke é um Objeto

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        /*Aplicando métodos ao meus objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);
        */
        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Você têm: " + Sasuke.idade + " então falta no minimo " + quantoTempoFalta + " anos para você se tornar um Hokage");

        // Criar Sakura Haruna
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruna";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 15;
    }
}
