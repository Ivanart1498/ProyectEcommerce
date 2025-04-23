package com.techlab.inicio;

public class CalculoStock {

    private final double precioUnitario;

    public final int cantidad;


    public CalculoStock(double precioUnitario, int cantidad){
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;

    }


    public double calculo(){

        return precioUnitario * cantidad;

    }
}
