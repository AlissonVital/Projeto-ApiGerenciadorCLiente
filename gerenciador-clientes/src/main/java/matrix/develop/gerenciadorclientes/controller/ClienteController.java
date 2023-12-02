package matrix.develop.gerenciadorclientes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import matrix.develop.gerenciadorclientes.domain.Cliente;
import matrix.develop.gerenciadorclientes.service.ClienteService;
import matrix.develop.gerenciadorclientes.util.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
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


    @GetMapping(path = "list/cliente")
    public List<Cliente> list() {
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return clienteService.listAll();
    }
}