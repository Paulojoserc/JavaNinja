package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
         *Ternários: São maneiras de reduzir o código
         *variável = ( condição ) ? valorSeVerdadeiro : valorSeFalso;
         */

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Este ninja tem menos de 10 missoes";
        System.out.println(nivel);
    }
}
