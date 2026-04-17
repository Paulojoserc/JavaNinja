package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {

    // Todos os atributos são FINAL por padrão

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }
}
