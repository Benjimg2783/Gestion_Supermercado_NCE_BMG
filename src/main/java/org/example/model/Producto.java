package org.example.model;

class Producto {
    // Atributo para almacenar el nombre del producto
    private String nombre;
    // Atributo para almacenar el precio de costo del producto
    private double precioCosto;
    // Atributo para almacenar el precio de venta del producto
    private double precioVenta;



    // Constructor que inicializa los atributos del producto
    public Producto(String nombre, double precioCosto, double precioVenta) {
        // Asignando los valores pasados como parámetros a los atributos correspondientes
        this.nombre = nombre;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    // Método para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el precio de costo del producto
    public double getPrecioCosto() {
        return precioCosto;
    }

    // Método para obtener el precio de venta del producto
    public double getPrecioVenta() {
        return precioVenta;
    }

    // Método para asignar un nuevo nombre al producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para asignar un nuevo precio de costo al producto
    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    // Método para asignar un nuevo precio de venta al producto
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}