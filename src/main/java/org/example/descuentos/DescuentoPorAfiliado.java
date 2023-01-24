package org.example.descuentos;

class DescuentoPorAfiliado extends DescuentoPorCategoria {
    public DescuentoPorAfiliado(double porcentajeDescuento) {
        super(porcentajeDescuento, "Afiliado");
    }
}
