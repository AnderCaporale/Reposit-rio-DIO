package bancodigital;

public class Cliente {
    private static int IDENTIFICADOR = 1;
    private int id;
    private String nome;
    
    public Cliente(String nome){
        this.id = IDENTIFICADOR++;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Transferir da conta corrente para a conta poupança de um mesmo cliente.
    public void guardarPoupanca(double valor, ContaCorrente cc, ContaPoupanca cp){
        if (this.getId() == cc.cliente.getId() && this.getId() == cp.cliente.getId()){
            if(cc.getSaldo() >= valor){
                cc.sacar(valor);
                cp.depositar(valor);
                System.out.println("Valor guardado na poupanca com sucesso.\n");
            }
            else{
                System.out.println("Valor insuficiente para guardar na poupanca!\n");
            }
        } else{
            System.out.println("So e possivel guardar na poupanca do mesmo titular!\n");
        }
    }
}
