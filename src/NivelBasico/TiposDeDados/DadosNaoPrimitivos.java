package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
    //Tudo que for digitado aqui dentro com comando PSVM vai se compilado pelo Java

        /*
        Dados não primitivos: String, Array, Class, enum
        Objetivo: Criar um ninja, e atribuir metodos a ele
         */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta= nome.toUpperCase(); //ToUppercase vai colocar tudo em CASPLOCK
        System.out.println("Esse texto esta em CAPSLOCK "+nomeEmCaixaAlta);
        System.out.println("Este texto esta normal "+ nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // ToLoweCase vai colocar tudo em caixa baixa/minusculo
        System.out.println(aldeiaEmCaixaBaixa);
    }
}
