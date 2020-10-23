package br.com.banco.modelo;

public class Endereco {
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String pontoReferencia;
    private String numero;
    private int cep;

    public Endereco(String pais,
                    String estado,
                    String cidade,
                    String bairro,
                    String rua,
                    String pontoReferencia,
                    String numero,
                    int cep) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.pontoReferencia = pontoReferencia;
        this.numero = numero;
        this.cep = cep;
        System.out.println("Endereço Cadastrado com sucesso: " + "Pais: " + this.pais + " Estado: " + this.estado + " Cidade: " + this.cidade + " Logradouro: " + this.rua
        		+ " Referencia" + this.pontoReferencia + " Numero: " + this.numero + " Cep: " + this.cep);
    }
}
