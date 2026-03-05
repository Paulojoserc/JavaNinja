package NivelIntermediario.GettersSetters;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------Naruto Uzumaki-----------------------------");
        Uzumaki naruto = new Uzumaki("Naruto","Aldeia da Folha", 16, 10, 1.60);
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println("Meu nome alterado é: " + naruto.getNome());
        System.out.println("-----------------------------Naruto Uzumaki-----------------------------");
    }
}
