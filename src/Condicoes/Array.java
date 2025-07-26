package Condicoes;

public class Array {
    public static void main(String[] args) {

        /*
        * Arrays são tipos referencia!
        * Não são flexível
         */

        /*
        *Inicializa como null
        * Obs: Todos estes nomes ocupa apenas um espaço na memória
        * String inicializa como null
        */

        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[5]);

        //Array int inicializa como 0
        int[] idade = new int[2];
        System.out.println(idade[1]);

        // Array boolean sempre inicializa falso
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // Double inicializam com 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);

        /*exemplo de stringa cada nome abaixo ocupa um espaço na memória exemplo se fosse 300 seria 300 espaço ocupado
        *diferente do array de string
        */
        String nomeDoninja1 = "Gaara do deserto";
        String nomeDoNinja2 = "Rock Lee";

    }
}
