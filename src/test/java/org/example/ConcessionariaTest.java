
import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class TestFlyWeight {
    @Test
    void retornaCarros() {
        Concessionaria concessionaria = new Concessionaria();
        concessionaria.cadastrar("New Fiesta", "Ford", "USA");
        concessionaria.cadastrar("Jetta", "Volkswagen", "Germany");
        concessionaria.cadastrar("Toro", "FIAT", "Italy");
        List<String> saida = Arrays.asList(
                "Carro{modelo='New Fiesta', marca='Ford', nacionalidade='USA'}",
                "Carro{modelo='Jetta', marca='Volkswagen', nacionalidade='Germany'}",
                "Carro{modelo='Toro', marca='FIAT', nacionalidade='Italy'}");
        assertEquals(saida, concessionaria.obterCarros());
    }
    @Test
    void deveRetornarTotalCidades() {
        Concessionaria concessionaria = new Concessionaria();
        concessionaria.cadastrar("New Fiesta", "Ford", "USA");
        concessionaria.cadastrar("Jetta", "Volkswagen", "Germany");
        concessionaria.cadastrar("Toro", "FIAT", "Italy");
        assertEquals(3, MarcaFactory.getTotalMarcas());
    }
}