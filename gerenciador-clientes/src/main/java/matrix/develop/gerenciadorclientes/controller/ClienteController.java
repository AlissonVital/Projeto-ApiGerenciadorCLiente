package matrix.develop.gerenciadorclientes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import matrix.develop.gerenciadorclientes.domain.Cliente;
import matrix.develop.gerenciadorclientes.util.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("gerenciador")
@Log4j2
@RequiredArgsConstructor
public class ClienteController {
    //localhost:8080/cliente/list
    private final DateUtil dateUtil;

    @GetMapping(path = "list/cliente")
    public List<Cliente> list() {
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM;yyyy");
        LocalDate dataCadastro = LocalDate.parse("01/12;2023", formatter);
        LocalDateTime dataCadastroCliente = dataCadastro.atStartOfDay();
        return List.of(
                new Cliente("Alisson Ferreira", "33508590811", null, "409613666", null, "2974503", "20524503", "981199630", dataCadastroCliente, "ATIVO"),

                new Cliente("Marcia Porto", "23422344144", null, "123456789", null, "24253748", "53040320", "953040320", dataCadastroCliente, "ATIVO"),

                new Cliente("Egina Vital", "23423553945", null, "765432789", null, "20304050", "59090900", "959090900", dataCadastroCliente, "ATIVO"),

                new Cliente("Silson Ferreira", "54676554654", null, "132446869", null, "20292873", "58839280", "958839280", dataCadastroCliente, "ATIVO"),

                new Cliente("Zelita Porto", "53453464576", null, "315362786", null, "28039484", "58893808", "958893808", dataCadastroCliente, "ATIVO"),

                new Cliente("Aparecidi Nougueira", "46546345345", null, "412641857", null, "25093459", "57838379", "957838379", dataCadastroCliente, "ATIVO")
        );
    }
}