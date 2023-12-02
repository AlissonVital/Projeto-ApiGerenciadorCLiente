package matrix.develop.gerenciadorclientes.service;

import matrix.develop.gerenciadorclientes.domain.Cliente;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

//      -----Lógica de negócio-----

@Service
public class ClienteService {


    public List<Cliente> listAll(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataCadastro = LocalDate.parse("01/12/2023", formatter);

        return List.of(
                new Cliente(1L, "Alisson Ferreira", "33508590811", null, "409613666", null, "2974503", "20524503", "981199630", dataCadastro, "ATIVO"),

                new Cliente(2L, "Marcia Porto", "23422344144", null, "123456789", null, "24253748", "53040320", "953040320", dataCadastro, "ATIVO"),

                new Cliente(3L, "Egina Vital", "23423553945", null, "765432789", null, "20304050", "59090900", "959090900", dataCadastro, "ATIVO"),

                new Cliente(4L, "Silson Ferreira", "54676554654", null, "132446869", null, "20292873", "58839280", "958839280", dataCadastro, "ATIVO"),

                new Cliente(5L, "Zelita Porto", "53453464576", null, "315362786", null, "28039484", "58893808", "958893808", dataCadastro, "ATIVO"),

                new Cliente(6L, "Aparecidi Nougueira", "46546345345", null, "412641857", null, "25093459", "57838379", "957838379", dataCadastro, "ATIVO")
        );
    }
}

