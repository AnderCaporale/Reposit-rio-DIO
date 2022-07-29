package bancodigital;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    
    @Override
    public void imprimir(){
        System.out.println("***INFOS CONTA POUPANÇA***");
        super.imprimirInfosComuns();
    }

}