package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    // Lista de productos en el inventario
    private List<Producto> productos;

    public Inventario() {
        // Inicializando la lista de productos
        productos = new ArrayList<Producto>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del inventario
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para obtener un producto específico del inventario
    public Producto obtenerProducto(int index) {
        return productos.get(index);
    }

    // Método para calcular el inventario total (suma del precio de venta de todos los productos)
    public double calcularInventarioTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecioVenta();
        }
        return total;
    }

    // Método para mostrar todos los productos del inventario
    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecioVenta());
        }
    }

    // Método para buscar un producto en el inventario dado un nombre
    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if(producto.getNombre().equals(nombre)){
                return producto;
            }
        }
        return null;
    }


}