package bancodigital;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    
    @Override
    public void imprimir(){
        System.out.println("***INFOS CONTA CORRENTE***");
        super.imprimirInfosComuns();
    }
    
    public void fazerEmprestimo(double valor){
        if (this.getSaldo()*2 >= valor){
            this.depositar(valor);
            System.out.println("Empréstimo aceito.\n");
        } else{
            System.out.println("Empréstimo recusado.\n");
        }
    }
}
