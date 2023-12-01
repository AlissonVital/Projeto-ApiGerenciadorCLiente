package matrix.develop.gerenciadorclientes.domain;

import java.time.LocalDateTime;

public class Cliente {

    private String name;
    private String cpf;
    private String cnpj;
    private String rg;
    private String ie;
    private String telefonePrincipal;
    private String telefoneRecado;
    private String celular;
    private LocalDateTime dataCadastro;
    private String situacao = "ATIVO";

    public Cliente() {
    }

    public Cliente(String name, String cpf, String cnpj, String rg, String ie, String telefonePrincipal, String telefoneRecado, String celular, LocalDateTime dataCadastro, String situacao) {
        this.name = name;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.rg = rg;
        this.ie = ie;
        this.telefonePrincipal = telefonePrincipal;
        this.telefoneRecado = telefoneRecado;
        this.celular = celular;
        this.dataCadastro = dataCadastro;
        this.situacao = situacao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getTelefonePrincipal() {
        return telefonePrincipal;
    }

    public void setTelefonePrincipal(String telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }

    public String getTelefoneRecado() {
        return telefoneRecado;
    }

    public void setTelefoneRecado(String telefoneRecado) {
        this.telefoneRecado = telefoneRecado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}