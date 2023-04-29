public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private Double saldo;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double saque){
        if(saldo >= saque){
            this.saldo -= saque;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir(ContaBancaria conta, double valor){
        if(saldo >= valor){
            this.saldo -= valor;
            conta.setSaldo(conta.getSaldo()+valor);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}
