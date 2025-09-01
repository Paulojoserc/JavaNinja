package NivelIntermediario.desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade){

        this.especialidade=especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(habilidade);
        System.out.println(nome + " tem a habilidade especial " + especialidade);
    }

    @Override
    public void executarHabilidade() {

    }
}
