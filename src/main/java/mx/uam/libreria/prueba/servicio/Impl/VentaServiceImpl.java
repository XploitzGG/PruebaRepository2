package mx.uam.libreria.prueba.servicio.Impl;

import mx.uam.libreria.prueba.entidades.Venta;
import mx.uam.libreria.prueba.repositorio.VentaRepository;
import mx.uam.libreria.prueba.servicio.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {  // Implementa la interfaz
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> listarTodas() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta guardarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Venta obtenerVentaPorId(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarVenta(Long id) {
        ventaRepository.deleteById(id);
    }
}