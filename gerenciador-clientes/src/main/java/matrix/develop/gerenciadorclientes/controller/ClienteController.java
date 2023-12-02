package matrix.develop.gerenciadorclientes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import matrix.develop.gerenciadorclientes.domain.Cliente;
import matrix.develop.gerenciadorclientes.service.ClienteService;
import matrix.develop.gerenciadorclientes.util.DateUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

//      -----Gerencia os EndPoints-----

@RestController
@RequestMapping("clientes")
@Log4j2
@RequiredArgsConstructor
public class ClienteController {
    private final DateUtil dateUtil;

    private final ClienteService clienteService;

    //transformar os dados em uma String para ser acessados por requisição
    @GetMapping
    public ResponseEntity<List<Cliente>> list() {
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(clienteService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable long id) {
        return ResponseEntity.ok(clienteService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.save(cliente), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        clienteService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody Cliente cliente) {
        clienteService.replace(cliente);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}