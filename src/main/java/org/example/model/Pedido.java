package org.example.model;

import org.example.interfaces.Descuento;

import java.util.List;

public class Pedido{
    private Descuento descuento;
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> compra;
    //Constructor principal
    public Pedido( Cliente cliente, Empleado empleado, List<Producto> compra) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.compra = compra;
    }

    // Constructor secundario que recibe un objeto de tipo Descuento
    public Pedido(Cliente cliente, Empleado empleado, List<Producto> compra, Descuento descuento) {
        this(cliente, empleado, compra);
        this.descuento = descuento;
    }


    public double calcularTotalDelPedido(){
        Double precio=0.0;
        for (int i =0;i<=compra.size();i++){
            precio+=compra.get(i).getPrecioVenta();
        }
        if (descuento!=null) return descuento.aplicarDescuento(precio);
        else return precio;
    }

}
