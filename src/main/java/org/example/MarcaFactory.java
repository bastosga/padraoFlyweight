package org.example;

import java.util.HashMap;
import java.util.Map;

public class MarcaFactory {
    private static Map<String, Marca> marcas = new HashMap<>();
    public static Marca getMarca(String nome, String nacionalidade) {
        Marca marca = marcas.get(nome);
        if (marca == null) {
            marca = new Marca(nome, nacionalidade);
            marcas.put(nome, marca);
        }
        return marca;
    }
    public static int getTotalMarcas() {
        return marcas.size();
    }

}