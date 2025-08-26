package NivelBasico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        /*
         * if e else - (Condiçoes) { resultado}
         * else if - (Condiçoes) { resultado}
         * else - { resultado caso nada seja verdadeiro}
         * Objetivo: Passar o ninja de nivel de acordo com o numero de missões
         **/
        //Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        //se (condição {faça isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >=20) {
            System.out.println("Rank: Jounin");
        }else {
            System.out.println("Rack: Gennim");
        }
    }
}
