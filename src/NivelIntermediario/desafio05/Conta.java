package NivelIntermediario.desafio05;

public interface Conta {
    void consultarSaldo();

    void depositar(double valor);

    void transferencia(double valor, ContaBancaria contaDestino);
}
