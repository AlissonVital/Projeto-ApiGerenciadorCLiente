package matrix.develop.gerenciadorclientes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import matrix.develop.gerenciadorclientes.domain.Cliente;
import matrix.develop.gerenciadorclientes.service.ClienteService;
import matrix.develop.gerenciadorclientes.util.DateUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

//      -----Gerencia os EndPoints-----

@RestController
@RequestMapping("gerenciador")
@Log4j2
@RequiredArgsConstructor
public class ClienteController {
    //localhost:8080/gerenciador/list/cliente
    private final DateUtil dateUtil;

    private final ClienteService clienteService;

    //transformar os dados em uma String para ser acessados por requisição
    @GetMapping(path = "list/cliente")
    public ResponseEntity<List<Cliente>> list() {
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(clienteService.listAll());
    }

    @GetMapping(path = "list/cliente/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable long id) {
        return ResponseEntity.ok(clienteService.findById(id));
    }
}