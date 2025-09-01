package NivelIntermediario.desafio04;

public enum TipoHabilidade {
    TAIJUTSU("Taijutsu"),
    NINJUTSU("Ninjutsu"),
    GENJUTSU("Genjutsu"),
    KATON("Katon"),
    RINNENGAN("Rinnegan");

    final String tipoDeHabilidade;

    TipoHabilidade(String tipoDeHabilidade){
        this.tipoDeHabilidade = tipoDeHabilidade;
    }

    public String getTipoDeHabilidade(){
        return tipoDeHabilidade;
    }
}
