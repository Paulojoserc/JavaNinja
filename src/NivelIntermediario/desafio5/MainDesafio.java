package NivelIntermediario.desafio5;

public class MainDesafio {
    public static void main(String[] args) {
        System.out.println("=======================================");
        ContaCorrente cc1 = new ContaCorrente(1, 500.0, TipoConta.CORRENTE);
        System.out.println(cc1);
        cc1.consultarSaldo();
        cc1.depositar(1000.00);
        cc1.consultarSaldo();

        System.out.println("=======================================");

        ContaPoupanca cp1 = new ContaPoupanca(2, 0, TipoConta.POUPANÇA);
        System.out.println(cp1);
        cp1.consultarSaldo();
        cp1.depositar(1000);
        cp1.consultarSaldo();
        System.out.println("=======================================");
        cc1.transferencia(1500, cp1);
        System.out.println("=======================================");
        cp1.consultarSaldo();

    }
}
