package org.example.model;

import org.example.interfaces.Descuento;

import java.util.List;

public class Cliente extends Persona {

    // Atributos de la clase
    private double dinero;
    private List<Producto> listaCompra;


    // Constructor
    public Cliente(String dni,
                  String nombre,
                  int edad,
                  char sexo,
                  String direccion,
                  double dinero,
                   List<Producto> listaCompra) {

        this.dinero=dinero;
        this.listaCompra=listaCompra;
        super.dni = dni;
        super.nombre = nombre;
        super.edad = edad;
        super.sexo = sexo;
        super.direccion = direccion;
    }


    // Getter y setters

    public double getdinero() {
        return dinero;
    }

    public void setDinero(int dinero){
        this.dinero=dinero;
    }

    public List<Producto> getListaDeLaCompra() {
        return listaCompra;
    }

    public void setListaDeLaCompra(List<Producto> listaDeLaCompra) {
        this.listaCompra = listaDeLaCompra;
    }

    // Método toString

    @Override
    public String toString() {
        return super.toString() +  ", Lista de la compra = " + listaCompra
                +  ", dinero = " + dinero;
    }

    //Suma dinero al cliente
    public void sumDinero(double dineroIngresado) {
        this.dinero += dineroIngresado;
    }

    //Resta dinero al cliente
    public void restaDinero(double dineroExtraido) {
        this.dinero += dineroExtraido;
    }

    public void anadirProductoALaLista(Producto producto){
        this.listaCompra.add(producto);
    }
    public void eliminarProductoDeLaLista(Producto producto){
        int count=0;
        for (int i = 0; i <= this.listaCompra.size(); i++){
            if (this.listaCompra.get(i) ==producto)break;
            else count++;
        }
        if (count>this.listaCompra.size()) System.out.println("elemento no encontrado");
        else this.listaCompra.remove(count);
    }

    /**método mediante el cual un cliente raliza un pedido
     * @param descuento descuento aplicable
     *
     * @param empleado empleado mediante el cual se efectúa el pedido
     *
     * @return el pedido
     * **/
    /**public Pedido realizarPedido(Empleado empleado, Descuento descuento){
        if (descuento==null){
            return new Pedido(this,empleado,listaCompra);
        } else {
            return new Pedido(this, empleado, listaCompra, descuento);
        }
    }
     **/
}