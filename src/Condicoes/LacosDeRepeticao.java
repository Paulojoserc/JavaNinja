package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
         * Laços de Repetição: Vão repetir infinitamente ou até você atingir o parâmetro desejado.
         * While = For
         */

        // While
        //estrutura: while (condição) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMAximoDeClone = 40;

        while (numeroDeClones <= numeroMAximoDeClone){
             numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras " + numeroDeClones);
        }

        // estrutura: FOR

        for (int i = 0; i <= numeroMAximoDeClone; i++) {
            System.out.println("O naruto esta se clonando e já se clonou "+i);
        }
    }
}
