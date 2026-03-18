package NivelIntermediario.SemGenerics;

public class Main {
    public static void main(String[] args) {

        Kunai kunai1 = new Kunai("Kunai normal");
        Kunai kunai2 = new Kunai("Kunai explosiva");
        Kunai kunai3 = new Kunai("Kunai de água");

        BolsaKunai bolsaKunai = new BolsaKunai();
        bolsaKunai.adcionarKunai(kunai1);
        bolsaKunai.adcionarKunai(kunai2);
        bolsaKunai.adcionarKunai(kunai3);
        System.out.println(bolsaKunai);
    }
}
