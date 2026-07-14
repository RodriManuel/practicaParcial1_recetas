package ar.edu.unahur.obj2.practicaparcial1.nutricionista;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class NutricioistaTest {

    @Test
    void dadoUnNutricionista_cuandoASuClienteNoLeGustaNada_leDaUnBatidoMagico() {
        Cliente cliente = new Cliente(4444444);
        Nutricionista nutricionista = Nutricionista.getInstance();

        nutricionista.visitarCliente(cliente);

        IReceta recetaCliente = cliente.getRegistroDeRecetasRecibidas().get(0);

        assertEquals("Batido Mágico", recetaCliente.getNombre());
    }
}
