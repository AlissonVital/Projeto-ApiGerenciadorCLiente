package matrix.develop.gerenciadorclientes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

//      -----Representa os dados de cadastros-----

@Data   //-----Cria os getters e setters-----
@AllArgsConstructor     //-----Cria os construtores-----
public class Cliente {

    private Long id;
    private String name;
    private String cpf;
    private String cnpj;
    private String rg;
    private String ie;
    private String telefonePrincipal;
    private String telefoneRecado;
    private String celular;
    private String dataCadastro;
    private String situacao = "ATIVO";
}