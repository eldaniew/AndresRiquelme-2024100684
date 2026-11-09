/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andresriquelme.servicio;

import com.andresriquelme.dao.ProductoDAO;
import com.andresriquelme.modelo.Producto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HOME
 */
public class ProductoService {
    private final ProductoDAO dao = new ProductoDAO();

    public void guardar(Producto p) throws ServicioException {
        if (p.getNombre() == null || p.getNombre().trim().isEmpty()) {
            throw new ServicioException("El nombre es obligatorio.");
        }
        if (p.getPrecio() <= 0) {
            throw new ServicioException("El precio debe ser mayor a 0.");
        }
        if (p.getStock() < 0) {
            throw new ServicioException("El stock no puede ser negativo.");
        }
        try {
            p.setNombre(p.getNombre().trim());
            dao.insertar(p);
        } catch (SQLException e) {
            throw new ServicioException("Error al guardar en la base de datos.", e);
        }
    }

    public List<Producto> listar() throws ServicioException {
        try {
            return dao.listar();
        } catch (SQLException e) {
            throw new ServicioException("Error al listar los productos.", e);
        }
    }
}
