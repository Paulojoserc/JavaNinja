package NivelIntermediario.Enums;

public class Missoes {
    private String nome;
    private RankMissoes rank;

    public Missoes() {
    }

    //Método para mostrar mais informações
    public void exibirDetalhes(){
        System.out.println("Missão: "+nome + " de Rank: "+rank +": (Descrição: "+rank.getDescricao()+", Dificuldade: "+rank.getDificuldade()  +")");
    }

    public Missoes(String nome, RankMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public RankMissoes getRank() {
        return rank;
    }

    public void setRank(RankMissoes rank) {
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
