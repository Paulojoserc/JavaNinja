package NivelIntermediario.desafio03;

public class Principal {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchira";
        Sasuke.idade = 18;
        Sasuke.missao = "Pegar ladrão";
        Sasuke.dificuldade = "Fácil";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.habilidadeEspecial = "Sharigan";

        Sasuke.mostrarHabilidadeEspecial();
    }
}
