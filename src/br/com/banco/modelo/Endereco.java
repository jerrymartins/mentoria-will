package br.com.banco.modelo;

public class Endereco {
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String descicaoLogradouro;
    private String numero;
    private int cep;

    public Endereco(String pais,
                    String estado,
                    String cidade,
                    String bairro,
                    String logradouro,
                    String descicaoLogradouro,
                    String numero,
                    int cep) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.descicaoLogradouro = descicaoLogradouro;
        this.numero = numero;
        this.cep = cep;
        System.out.println("Endere�o Cadastrado com sucesso: " + "Pais: " + this.pais + " Estado: " + this.estado + " Cidade: " + this.cidade + " Logradouro: " + this.logradouro
        		+ " Referencia" + this.descicaoLogradouro + " Numero: " + this.numero + " Cep: " + this.cep);
    }
}
