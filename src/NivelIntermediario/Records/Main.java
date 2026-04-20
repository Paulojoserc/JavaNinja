package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {
     Ninja  cadasto = new Ninja("Naruto", "naruto@email.com", 859999999);
        System.out.println("Cadastro = " + cadasto);
        System.out.println("Nome do cadastro = " +cadasto.getNome());

     NinjaRecord cadastoUsandoRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 858888888);
        System.out.println("Cadastro usando RECORDS = " + cadastoUsandoRecord);
        System.out.println("Nome do cadastro usando RECORDS = " +cadastoUsandoRecord.nome());

        //Exemplo do uso de RECORDS
     NomeNinja cadastroNinja = new NomeNinja("Jiraya", 01 );
        System.out.println("O cadastro é: "+cadastroNinja );
    }
}
