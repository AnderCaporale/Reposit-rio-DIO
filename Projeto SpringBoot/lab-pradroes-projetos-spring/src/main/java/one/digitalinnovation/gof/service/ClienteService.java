package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão Strategy no domínio de Cliente.Com isso, se
 * necessário, podemos ter multiplas implementações dessa mesma interface.
 * 
 * @author user
 */

public interface ClienteService {
    
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
    
}
