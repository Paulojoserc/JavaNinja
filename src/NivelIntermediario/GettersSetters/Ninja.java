package NivelIntermediario.GettersSetters;

public abstract class Ninja {

   private String nome;
   private String aldeia;
   private int idade;
   private int numeroDeMissoesConcluidas;
   private double altura;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    // tirar dados ou mostrar para o usuário eu uso o GET + NOME da VARIAVEL

   public String getNome() {
       return nome;
   }

   // Setter recebe valores
   public void setNome(String nome) {
       this.nome = nome;
   }

   public double getAltura() {
       return altura;
   }
   public void setAltura(double altura) {
       this.altura = altura;
   }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

}
