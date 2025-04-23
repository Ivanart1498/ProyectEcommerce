package com.techlab.inicio;

import java.util.Scanner;

public class SaludoPersonalizado {
    public static void main(String [] args){
        CalculoStock calcStock = new CalculoStock(200, 10);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre: ");
        String nombreCliente = teclado.nextLine();
        System.out.println("¡Bienvenido a nuestra tienda " + nombreCliente + "!");

        System.out.println("Hola, Bienvenidos a la nueva aplicación java");

        int stockCafePremium = 150;
        System.out.println("Cantidad actual de stock del Cafe Premium: " + stockCafePremium);


        System.out.println("El costo total del pedido es: $" + calcStock.calculo());

        int demanda = 120;

        
    }
}
