package org.example;

public class Carro {

    private String modelo;
    private Marca marcaCarro;

    public Carro(String modelo, Marca marcaCarro) {
        this.modelo = modelo;
        this.marcaCarro = marcaCarro;
    }

    public String obterCarro() {
        return "Carro{" +
                "modelo='" + this.modelo + '\'' +
                ", marca='" + marcaCarro.getNome() + '\'' +
                ", nacionalidade='" + marcaCarro.getNacionalidade() + '\'' +
                '}';
    }
}