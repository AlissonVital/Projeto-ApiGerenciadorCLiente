package matrix.develop.gerenciadorclientes.repository;

import matrix.develop.gerenciadorclientes.domain.Cliente;

import java.util.List;

//      -----Conexão diretamente com o DB-----

public interface ClienteRepository {
    List<Cliente> listAll();
}
