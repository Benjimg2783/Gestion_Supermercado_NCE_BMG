package org.example.model;


public class Cliente extends Persona {

    // Atributos de la clase
    private double dinero;


    // Constructor
    public Cliente(String dni,
                  String nombre,
                  int edad,
                  char sexo,
                  String direccion,
                  double dinero) {

        this.dinero=dinero;
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

    // Método toString

    @Override
    public String toString() {
        return super.toString() + ", dinero = " + dinero;
    }

    //Suma dinero al cliente
    public void sumDinero(double dineroIngresado) {
        this.dinero += dineroIngresado;
    }

    //Resta dinero al cliente
    public void restaDinero(double dineroExtraido) {
        this.dinero += dineroExtraido;
    }

    public boolean pagarPedido(Double pago){
        return !(dinero - pago < 0);
    }
}