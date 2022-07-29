
package bancodigital;


public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo >= valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferencia realizada com sucesso.\n");
        } else{
            System.out.println("Saldo na conta insuficiente.\n");
        }
    }
    
    protected void imprimirInfosComuns(){
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("************************** \n");
    }
   
}
