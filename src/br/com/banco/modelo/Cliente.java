package br.com.banco.modelo;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String profissao, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.endereco = endereco;
        System.out.println(" Cliente cadastrado com sucesso: " + " Nome Cliente: "  + this.nome + " CPF: " + this.cpf +" Profiss�o: " + this.profissao);
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String getProfissao() {
        return profissao;
    }

    private void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    private Endereco getEndereco() {
        return endereco;
    }

    private void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
