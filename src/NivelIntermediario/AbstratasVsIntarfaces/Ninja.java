package NivelIntermediario.AbstratasVsIntarfaces;

abstract class Ninja {
    // Método abstrato que deve ser implementado pelas subclasses
    abstract void realizarJutsu();
    // Método concreto que pode ser compartilhado pelas subclasses
    public void apresentar() {
        System.out.println("Sou um ninja da Vila da Folha.");
    }
}
