package org.example.model;

/**
 * Clase Empleado que hereda de la clase Persona, contiene información adicional de un empleado
 * como su sueldo y su id de empleado.
 */
public class Empleado extends Persona {
    private double sueldo;
    private int idEmpleado;

    /**
     * Constructor de la clase Empleado.
     *
     * @param dni        Dni del empleado
     * @param nombre     Nombre del empleado
     * @param edad       Edad del empleado
     * @param sexo       Sexo del empleado
     * @param direccion  Direccion del empleado
     * @param sueldo     Sueldo del empleado
     * @param idEmpleado Id del empleado
     */
    public Empleado(String dni,
                    String nombre,
                    int edad,
                    char sexo,
                    String direccion,
                    double sueldo,
                    int idEmpleado) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.idEmpleado = idEmpleado;
    }

    /**
     * Obtener el sueldo del empleado
     *
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Asignar el sueldo del empleado
     *
     * @param sueldo Sueldo del empleado
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Obtener el id del empleado
     *
     * @return idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Asignar el id del empleado
     *
     * @param idEmpleado Id del empleado
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Método toString que devuelve información del objeto en forma de String
     *
     * @return String
     */
    @Override
    public String toString() {
        return " DNI = " + dni +
                ", nombre = " + nombre +
                ", edad = " + edad +
                ", sexo = " + sexo +
                ", direccion = " + direccion +
                ", sueldo = " + sueldo +
                ", idEmpleado = " + idEmpleado;
    }
}

