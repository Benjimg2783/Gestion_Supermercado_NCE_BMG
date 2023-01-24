package org.example;

import org.example.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventario inventario=new Inventario();
        boolean comprobador=true;
        Scanner scanner=new Scanner(System.in);
        ArrayList<Cliente> listaClientes= new ArrayList<>();
        ArrayList<ClienteAfiliado> listaClientesAfiliados= new ArrayList<>();
        ArrayList<Empleado> listaEmpleados= new ArrayList<>();
        ArrayList<Producto> listaProductos= new ArrayList<>();
        while (comprobador){
            System.out.println("Qué deseas hacer? \n" +
                    "1. Crear un nuevo cliente." +
                    "2. Crear un producto (este se añadira de forma automática al inventario)." +
                    "3. Crear un nuevo empleado." +
                    "4. Realizar un pedido (Recomendamos crear un cliente, un empleado y al menos un producto)." +
                    "5. Salir");
            int respuesta=scanner.nextInt();
            if(respuesta==1){
                System.out.println("¿Quieres que sea un cliente afiliado? s/n");
                String afiliado=scanner.nextLine().toUpperCase();
                if (afiliado.equals("N")) {
                    System.out.println("Introduce el dni del cliente");
                    String dni = scanner.nextLine();
                    System.out.println("Introduce el nombre del cliente");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce edad del cliente (Int)");
                    Integer edad = scanner.nextInt();
                    System.out.println("Introduce el sexo del cliente(H o M)");
                    Character sexo = scanner.nextLine().toUpperCase().charAt(0);
                    System.out.println("Introduce la direccion del cliente");
                    String direccion = scanner.nextLine();
                    System.out.println("Introduce el dinero del cliente (Double)");
                    Double dinero = scanner.nextDouble();
                    try {
                        Cliente cliente = new Cliente(dni, nombre, edad, sexo, direccion, dinero);
                        listaClientes.add(cliente);
                    } catch (Exception e) {
                        System.out.println("Algun campo se ha intraducido de manera erronea vuelve a intentarlo");
                    }
                }
                else if(afiliado.equals("S")) {
                    System.out.println("Introduce el dni del cliente");
                    String dni = scanner.nextLine();
                    System.out.println("Introduce el nombre del cliente");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce edad del cliente (Int)");
                    Integer edad = scanner.nextInt();
                    System.out.println("Introduce el sexo del cliente(H o M)");
                    Character sexo = scanner.nextLine().toUpperCase().charAt(0);
                    System.out.println("Introduce la direccion del cliente");
                    String direccion = scanner.nextLine();
                    System.out.println("Introduce el dinero del cliente (Double)");
                    Double dinero = scanner.nextDouble();
                    System.out.println("Introduce el número de afiliacion del cliente (Int)");
                    Integer nAfiliado = scanner.nextInt();
                    System.out.println("Introduce el número de puntos del cliente (Int)");
                    Integer puntos = scanner.nextInt();
                    try {
                        ClienteAfiliado cliente = new ClienteAfiliado(dni, nombre, edad, sexo, direccion, dinero,nAfiliado,puntos);
                        listaClientesAfiliados.add(cliente);
                    } catch (Exception e) {
                        System.out.println("Algun campo se ha intraducido de manera erronea vuelve a intentarlo");
                    }
                }else System.out.println("Error");
            } else if (respuesta==2) {
                System.out.println("Introduce el dni del empleado");
                String dni= scanner.nextLine();
                System.out.println("Introduce el nombre del empleado");
                String nombre= scanner.nextLine();
                System.out.println("Introduce edad del empleado (Int)");
                Integer edad= scanner.nextInt();
                System.out.println("Introduce el sexo del empleado(H o M)");
                Character sexo= scanner.nextLine().toUpperCase().charAt(0);
                System.out.println("Introduce la direccion del empleado");
                String direccion= scanner.nextLine();
                System.out.println("Introduce el sueldo del empleado(Double)");
                Double sueldo= scanner.nextDouble();
                System.out.println("Introduce el id del empleado (Int)");
                Integer id= scanner.nextInt();
                try {
                    Empleado empleado = new Empleado(dni, nombre, edad, sexo, direccion, sueldo,id);
                    listaEmpleados.add(empleado);
                }catch (Exception e){
                    System.out.println("Algun campo se ha intraducido de manera erronea vuelve a intentarlo");
                }
            } else if (respuesta==3) {
                System.out.println("Introduce el nombre del producto");
                String nombre= scanner.nextLine();
                System.out.println("Introduce el costo del producto(Double)");
                Double precioCosto= scanner.nextDouble();
                System.out.println("Introduce el precio de venta del producto(Double)");
                Double precioVenta= scanner.nextDouble();
                try {
                    Producto producto = new Producto(nombre,precioCosto,precioVenta);
                    listaProductos.add(producto);
                    inventario.agregarProducto(producto);
                }catch (Exception e){
                    System.out.println("Algun campo se ha intraducido de manera erronea vuelve a intentarlo");
                }
            } else if (respuesta==4) {
                Cliente cliente=null;
                Empleado empleado=null;
                System.out.println("Introduce el nombre del cliente que va a realizar el pedido");
                String nCliente= scanner.nextLine();
                for (int i =0; i<=listaClientes.size()&& i<=listaClientesAfiliados.size();i++){
                    if (Objects.equals(listaClientes.get(i).getNombre(), nCliente) || Objects.equals(listaClientesAfiliados.get(i).getNombre(), nCliente)){
                        cliente = listaClientes.get(i);
                    }
                }
                System.out.println("Introduce el nombre del empleado que va a realizar el pedido");
                String nEmpeado= scanner.nextLine();
                for (int i =0; i<=listaEmpleados.size();i++){
                    if (Objects.equals(listaEmpleados.get(i).getNombre(), nEmpeado)){
                        empleado = listaEmpleados.get(i);
                    }
                }
                System.out.println("Introduce el numero de productos que va a realizar en el pedido");
                Integer numProductos=scanner.nextInt();
                ArrayList<Producto> productosPedidos= new ArrayList<>((Collection<? extends Producto>) listaProductos.get(700));
                for (int i = 0; i<numProductos;i++){
                    System.out.println("Introduce el nombre");
                    String nProducto = scanner.nextLine();
                    for (int j =0; j<=listaProductos.size();j++){
                        if (Objects.equals(listaProductos.get(j).getNombre(), nProducto)){
                            productosPedidos.add(listaProductos.get(j));
                        }
                    }
                }
                try {
                    Pedido pedido = new Pedido(cliente,empleado,productosPedidos,inventario);
                    System.out.println("Desea realizar el pago de " + pedido.calcularTotalDelPedido()+" (s/n)");
                    String pago = scanner.nextLine().toUpperCase();
                    if(pago.equals("S")){
                        if(pedido.getCliente().pagarPedido(pedido.calcularTotalDelPedido()))System.out.println("Pedido pagado");
                        else System.out.println("Saldo insuficiente");
                    }
                    else if (pago.equals("N")){}
                    else {System.out.println("Error");}
                }catch (Exception e){
                    System.out.println("Algun campo se ha intraducido de manera erronea vuelve a intentarlo");
                }
            } else if (respuesta==5) {
                comprobador=false;
            }else System.out.println("El número está fuera de rango vuelve a intentarlo");
        }

    }
}