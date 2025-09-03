package NivelIntermediario.AbstratasVsIntarfaces;

public class MainAbstrataVsInterfaces {
    public static void main(String[] args) {
        // Criando ninjas com diferentes habilidades
        Uzumaki naruto = new Uzumaki();

        Uchiha sasuke = new Uchiha();
        // Usando métodos das classes abstratas e interfaces
        naruto.apresentar();
        naruto.realizarJutsu();
        naruto.detectarChakra();
        sasuke.apresentar();
        sasuke.realizarJutsu();
        sasuke.detectarChakra();
    }
}
