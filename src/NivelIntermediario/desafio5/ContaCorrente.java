package NivelIntermediario.desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo);
        this.tipoConta = tipoConta;
    }

    public ContaCorrente(int numeroConta, double saldo, TipoConta tipoConta) {
        super(numeroConta, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        valor -= (valor * 0.05);
        saldo += valor;
    }

    @Override
    public void transferencia(double valor, ContaBancaria contaDestino) {
        if (valor > contaDestino.saldo){
            System.out.println("Não é possível realizar a transferência pois o valor é maior que o saldo.");
        }else {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Sua conta de numero:  " + numeroConta + " realizou uma transferência para a conta de numero:  " + contaDestino.numeroConta + ". Seu saldo agora é: " + saldo);
        }
    }


    @Override
    public String toString() {
        return "TIPO DA CONTA: " + tipoConta.toString() + " SALDO: " + saldo;
    }
}
