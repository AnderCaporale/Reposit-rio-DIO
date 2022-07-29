
package bancodigital;

public class BancoDigital {
    private String nome;
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Anderson");
        Cliente cliente2 = new Cliente("Caporale");
        
        ContaCorrente cc1 = new ContaCorrente(cliente1);
        ContaCorrente cc2 = new ContaCorrente(cliente2);
        ContaPoupanca cp1 = new ContaPoupanca(cliente1);
        ContaPoupanca cp2 = new ContaPoupanca(cliente2);
        
        cc1.depositar(100);
        cc1.transferir(80, cc2);
        cliente1.guardarPoupanca(5, cc1, cp1);
        
        cc1.imprimir();
        cc2.imprimir();
        cp1.imprimir();
        

    }
    
}
