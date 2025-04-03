package mx.uam.libreria.prueba.servicio;

import mx.uam.libreria.prueba.entidades.Venta;
import java.util.List;

public interface VentaService {
    List<Venta> listarTodas();
    Venta guardarVenta(Venta venta);
    Venta obtenerVentaPorId(Long id);
    void eliminarVenta(Long id);
}
