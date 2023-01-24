package org.example;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Empleado cl2 = new Empleado("213123","benji",12,'M',"asdsd",3230.0, 1);
        Producto producto1 = new Producto("Producto 1", 10,13);
        Producto producto2 = new Producto("Producto 2", 20,40);
        Producto producto3 = new Producto("Producto 3", 30,90);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);

        List<Producto> compra = new ArrayList<Producto>();
        compra.add(producto1);
        compra.add(producto2);
        compra.add(producto3);

        Cliente cl = new Cliente("213123","benji",12,'M',"asdsd",3230.0,compra);

        try {
            Pedido pedido = new Pedido(cl, cl2, compra, null, inventario);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}