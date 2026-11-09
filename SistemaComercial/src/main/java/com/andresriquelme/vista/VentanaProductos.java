/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andresriquelme.vista;

import com.andresriquelme.modelo.Producto;
import com.andresriquelme.servicio.ProductoService;
import com.andresriquelme.servicio.ServicioException;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaProductos extends JFrame {

    private final ProductoService servicio = new ProductoService();
    private final JTextField txtNombre = new JTextField(12);
    private final JTextField txtPrecio = new JTextField(8);
    private final JTextField txtStock = new JTextField(6);
    private final JButton btnGuardar = new JButton("Guardar");
    private final DefaultTableModel modeloTabla = new DefaultTableModel(
            new Object[]{"ID", "Nombre", "Precio", "Stock"}, 0) {
        @Override
        public boolean isCellEditable(int row, int col) { return false; }
    };
    private final JTable tabla = new JTable(modeloTabla);

    public VentanaProductos() {
        setTitle("Sistema Comercial - Productos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 400);
        setLocationRelativeTo(null);

        JPanel form = new JPanel(new FlowLayout(FlowLayout.LEFT));
        form.add(new JLabel("Nombre:"));  form.add(txtNombre);
        form.add(new JLabel("Precio:"));  form.add(txtPrecio);
        form.add(new JLabel("Stock:"));   form.add(txtStock);
        form.add(btnGuardar);

        add(form, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        btnGuardar.addActionListener(e -> guardar());
        cargarTabla();
    }

    private void guardar() {
        try {
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText().trim());
            int stock = Integer.parseInt(txtStock.getText().trim());

            servicio.guardar(new Producto(0, nombre, precio, stock));

            JOptionPane.showMessageDialog(this, "Producto guardado correctamente.",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            cargarTabla();   // refresca la tabla en tiempo real
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Precio y stock deben ser números válidos.",
                    "Dato inválido", JOptionPane.WARNING_MESSAGE);
        } catch (ServicioException ex) {
            int tipo = (ex.getCause() == null)
                    ? JOptionPane.WARNING_MESSAGE : JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Atención", tipo);
        }
    }

    private void cargarTabla() {
        try {
            modeloTabla.setRowCount(0);
            List<Producto> lista = servicio.listar();
            for (Producto p : lista) {
                modeloTabla.addRow(new Object[]{
                    p.getId(), p.getNombre(), p.getPrecio(), p.getStock()});
            }
        } catch (ServicioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtNombre.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaProductos().setVisible(true));
    }
}