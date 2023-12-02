package matrix.develop.gerenciadorclientes.service;

import matrix.develop.gerenciadorclientes.domain.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

//      -----Lógica de negócio-----

@Service
public class ClienteService {
    private static List<Cliente> clientes;
    static {
        clientes = new ArrayList<>(List.of(
                new Cliente(1L, "Alisson Ferreira", "33508590811", null, "409613666", null, "2974503", "20524503", "981199630", "01/12/2023", "ATIVO"),
                new Cliente(2L, "Marcia Porto", "23422344144", null, "123456789", null, "24253748", "53040320", "953040320", "02/12/2023", "ATIVO")
        ));
    }

    public List<Cliente> listAll() {
        return clientes;
    }

    public Cliente findById(long id) {
        return clientes.stream()
                .filter(cliente -> cliente.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Celiente not Found"));
    }

    public Cliente save(Cliente cliente) { //Ao clriar esse método, tive que acrescentar o static:private static List<Cliente> cliente = List.of, por não ter banco de dados ainda
        cliente.setId(ThreadLocalRandom.current().nextLong(3, 100000));
        clientes.add(cliente);
        return cliente;
    }

    public void delete(long id) {
        clientes.remove(findById(id));
    }
}

