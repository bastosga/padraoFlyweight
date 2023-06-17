package org.example;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private List<Carro> carros = new ArrayList<>();

    public void cadastrar(String modeloCarro, String nomeMarca, String nacionalidade) {
        Marca marca = MarcaFactory.getMarca(nomeMarca, nacionalidade);
        Carro carro = new Carro(modeloCarro, marca);
        carros.add(carro);
    }

    public List<String> obterCarros() {
        List<String> saida = new ArrayList<String>();
        for (Carro carro : this.carros) {
            saida.add(carro.obterCarro());
        }
        return saida;
    }


}