
public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();


        c1.setTitular("Vinicius");
        c1.setNumeroConta(1234);
        c1.setSaldo(2000.0);

        c2.setTitular("João");
        c2.setNumeroConta(5678);
        c2.setSaldo(0.0);

        c1.depositar(1000);
        System.out.printf("Seu novo saldo agora é: %.2f", c1.getSaldo());

        c1.sacar(500);
        System.out.printf("\nSaldo pós saque: %.2f", c1.getSaldo());

        c1.transferir(c2, 1000);
        System.out.printf("\nSaldo da conta %.2f", c2.getSaldo());

    }
}
