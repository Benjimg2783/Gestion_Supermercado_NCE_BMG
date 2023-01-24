package org.example.descuentos;

import org.example.interfaces.Descuento;

class DescuentoPorAfiliado extends DescuentoPorCategoria {
    public DescuentoPorAfiliado(double porcentajeDescuento) {
        super(porcentajeDescuento, "Afiliado");
    }
}
