package NivelIntermediario.desafio04;

public class MainDesafio04 {
    public static void main(String[] args) {
        Ninja sakura = new NinjaBasico("Sakura",18,TipoHabilidade.GENJUTSU);
        sakura.mostrarInformacoes();
        sakura.executarHabilidade();



        Ninja naruto = new NinjaAvancado("Naruto",17, "NINJUTSU", "Rasengan");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

    }
}
