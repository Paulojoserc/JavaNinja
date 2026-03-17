package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array
        //Array São estáticos, não altera de tamanho
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Printando Array = "+ninjasArray[0]);
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.print(ninjasArray[i]+" ");
        }

        //Listas
        //Listas não são estáticas
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki"); //Index 0
        ninjasList.add("Sasuke Uchiha"); //Index 1
        ninjasList.add("Sakura Harumo"); //Index 2
        ninjasList.add("Tobirama Senju"); //Index 3
        //Adcionar na lista
        ninjasList.add("Kakashi Hatake");

        System.out.println("ninjasList = "+ninjasList);
        //Remove na lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjasList = "+ninjasList);

        // Trocar Elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("ninjasList = "+ninjasList);

        //Ver o tamanho da Lista
        System.out.println("Tamanho da Lista = "+ninjasList.size()+ " elementos");


    }
}
