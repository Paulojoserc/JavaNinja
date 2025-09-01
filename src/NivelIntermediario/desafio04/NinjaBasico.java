package NivelIntermediario.desafio04;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico() {}

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println("Esta é minha habilidade "+habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome +" executou "+habilidade);
    }
}
