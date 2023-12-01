package matrix.develop.gerenciadorclientes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import matrix.develop.gerenciadorclientes.domain.Usuario;
import matrix.develop.gerenciadorclientes.util.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("gerenciador")
public class UsuarioController {

    private final DateUtil dateUtil;

    @GetMapping("list/usuario")
    public List<Usuario> list() {
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM;yyyy");
        LocalDate dataCadastro = LocalDate.parse("01/12;2023", formatter);
        LocalDateTime dataCadastroUsuario = dataCadastro.atStartOfDay();

        return List.of(
                new Usuario("Eliude", "Irmã"),

                new Usuario("Silmara", "Irmã")
        );

    }

}
