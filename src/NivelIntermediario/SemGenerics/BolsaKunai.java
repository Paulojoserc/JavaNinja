package NivelIntermediario.SemGenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai {
    private List<Kunai> kunais;
    public BolsaKunai(){
        this.kunais = new ArrayList<>();
    }

    public void adcionarKunai(Kunai kunai){
        kunais.add(kunai);
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    @Override
    public String toString() {
        return "Bolsa de kunais: " + kunais.toString();
    }
}
