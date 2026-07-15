package ar.edu.unahur.obj2.practicaparcial1.recetas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.decoradores.RodajasDePalta;

public class IRecetaTest {

    @Test
    void dadaUnaTartaDe500Calorias_CuandoSeLaDecoraConRodajasDePalta_EntoncesAumenta160Calorias() {
        IReceta tarta = new Receta("Tarta",
                            "Tartero",
                            500.0,
                            100);

        IReceta tartaDecorada = new RodajasDePalta(tarta);

        Double caloriasTarta = tarta.getValorNutricionalBase(); 
        Double caloriasTartaDecorada = tartaDecorada.getValorNutricionalBase();

        assertEquals(500.0, caloriasTarta);
        assertEquals(660.0, caloriasTartaDecorada);
    }
}
