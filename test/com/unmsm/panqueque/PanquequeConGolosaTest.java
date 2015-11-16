package com.unmsm.panqueque;

import com.unmsm.busqueda.Busqueda;
import com.unmsm.busqueda.Camino;
import com.unmsm.busqueda.informada.golosa.BusquedaGolosa;
import com.unmsm.busqueda.prioridad.Prioridad;
import com.unmsm.util.Consola;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur Mauricio Delgadillo
 */
public class PanquequeConGolosaTest {
    @Test
    public void GolosaValido() {
        Integer[] a = { 4,2,3,1};
        Busqueda busqueda = new BusquedaGolosa(new HeuristicaPanquequesDebajoMayor());
        Camino caminoSolucion = busqueda.buscar(new EstadoPanqueques(a));
        Consola.mostrar(caminoSolucion);
        assertEquals((int)caminoSolucion.getCosto(), 4);
        assertEquals(busqueda.getConteoBusqueda(), 5);
    }
}
