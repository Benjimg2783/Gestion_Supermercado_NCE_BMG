package org.example.model;

import org.example.interfaces.Descuento;

import java.util.List;

public class Pedido{
    private Descuento descuento;
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> compra;
    //Constructor principal
    public Pedido(Cliente cliente, Empleado empleado, List<Producto> compra, Inventario inventario) throws Exception {
        if (comprobarInventario(compra, inventario)) {
            this.cliente = cliente;
            this.empleado = empleado;
            this.compra = compra;
        } else {
            throw new Exception("Alguno de los productos no se encuentra en inventario");
        }
    }

    // Constructor secundario que recibe un objeto de tipo Descuento
    public Pedido(Cliente cliente, Empleado empleado, List<Producto> compra, Descuento descuento, Inventario inventario) throws Exception {
        if (comprobarInventario(compra, inventario)) {
            this.cliente = cliente;
            this.empleado = empleado;
            this.compra = compra;
            this.descuento = descuento;
        } else {
            throw new Exception("Alguno de los productos no se encuentra en inventario");
        }
    }


    public double calcularTotalDelPedido(){
        Double precio=0.0;
        for (int i =0;i<=compra.size();i++){
            precio+=compra.get(i).getPrecioVenta();
        }
        if (descuento!=null) return descuento.aplicarDescuento(precio);
        else return precio;
    }
    public boolean comprobarInventario(List<Producto> compra, Inventario inventario) {
        for (Producto producto : compra) {
            if (inventario.buscarProductoPorNombre(producto.getNombre()) == null) {
                return false;
            }
        }
        return true;
    }

}
