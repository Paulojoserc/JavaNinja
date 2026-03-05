package NivelIntermediario.Enums;

public class Main {
    public static void main(String[] args) {
        Missoes missao01 = new Missoes("Resgatar cachorro",RankMissoes.D);
        missao01.exibirDetalhes();

        Missoes missao02 = new Missoes("Derrotar Zabuza",RankMissoes.A);
        missao02.exibirDetalhes();
    }

}
