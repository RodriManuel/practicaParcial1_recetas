package ar.edu.unahur.obj2.practicaparcial1.clientes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.criterios.AltoValorNutricional;
import ar.edu.unahur.obj2.practicaparcial1.criterios.CriterioStrategy;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class ClienteTest {

    @Test
    void DadoUnClienteConCriterioAltoValorNutricional_CuandoRecibeRecetasQueSuperanSusCaloriasMinimas_EntoncesLeGustan() {
        IReceta recetaCalorica = new Receta("Pasta", 
                                            "Cocinero de Pasta", 
                                            11000.0,
                                            5);

        CriterioStrategy criterioAltoValor = new AltoValorNutricional(10000.0);

        Cliente cliente = new Cliente(44333222);
        cliente.cambiarCriterioPreferido(criterioAltoValor);

        Boolean leGustaLaPasta = cliente.leGustaLaReceta(recetaCalorica);

        assertTrue(leGustaLaPasta);
    }

    @Test
    void DadoUnClienteConCriterioAltoValorNutricional_CuandoRecibeRecetasQueSuperanSusCaloriasMinimas_EntoncesNoLeGustan() {
        IReceta recetaLiviana = new Receta("Manzana", 
                                            "Cocinero de Manzana", 
                                            1300.0,
                                            5000);

        CriterioStrategy criterioAltoValor = new AltoValorNutricional(10000.0);

        Cliente cliente = new Cliente(44333222);
        cliente.cambiarCriterioPreferido(criterioAltoValor);

        Boolean leGustaLaManzana = cliente.leGustaLaReceta(recetaLiviana);

        assertFalse(leGustaLaManzana);
    }
}
