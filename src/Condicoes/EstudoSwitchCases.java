package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
         *Switch Cases: Que servem para gerar casos especificos
         * Objetivo: Pedir pro usuário escolher entre os Ninja
         * switchCase
         */

        // Pedir para o usuário

        Scanner sc = new Scanner(System.in);

        // Mostrar opções para o usuário
        System.out.println("Escolha um personagem");

        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuário escolher uma das opções
        int escolhaDoUsuario = sc.nextInt();

        System.out.println("Você digitou o numero: "+ escolhaDoUsuario);

        //Reação ao escolher um personagem
        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki, o proximo hokage");
                break;

            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;

            case 3:
                System.out.println("O usuário escolheu o Sakura Haruno, a personagem medica");
                break;
            default:
                System.out.println("Esta opção não é valida! Tente de novo por favor");
        }


        sc.close();
    }
}
