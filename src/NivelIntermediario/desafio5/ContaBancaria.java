package NivelIntermediario.desafio5;

public class ContaBancaria implements Conta {

    int numeroConta;
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(int numeroConta, double saldo, TipoConta tipoConta) {
        this(saldo, tipoConta);
        this.numeroConta = numeroConta;

    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo da conta de número " + numeroConta + " é: " + saldo);
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferencia(double valor, ContaBancaria contaDestino) {

    }

}
