package org.example;

import java.util.List;

public class ClienteAfiliado extends Cliente {

    private int numeroAfiliado;
    private int puntos;

    public ClienteAfiliado(String dni,
                           String nombre,
                           int edad,
                           char sexo,
                           String direccion,
                           double dinero,
                           List<Producto> listaCompra,
                           int numeroAfiliado,
                           int puntos) {
        super(dni, nombre, edad, sexo, direccion, dinero, listaCompra);
        this.numeroAfiliado = numeroAfiliado;
        this.puntos = puntos;
    }

    public int getNumeroAfiliado() {
        return numeroAfiliado;
    }

    public void setNumeroAfiliado(int numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numeroAfiliado = " + numeroAfiliado +
                ", puntos = "+ puntos;
    }
    //Método para sumar puntos al cliente
    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

    //Método para restar puntos al cliente
    public void restarPuntos(int puntos) {
        this.puntos -= puntos;
    }

    /**
     * Método que devuelve el descuento del cliente dependiendo de su cantidad de puntos
     * @return Porcentaje de descuento (0 si no tiene puntos suficientes)
     */
    public double obtenerDescuento() {
        if (this.puntos >= 5000) {
            return 0.3;
        } else if (this.puntos >= 2500) {
            return 0.2;
        } else if (this.puntos >= 1000) {
            return 0.1;
        } else {
            return 0;
        }
    }
}
