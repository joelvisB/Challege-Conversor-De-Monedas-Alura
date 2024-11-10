package com.alura.conversordemoneda.principal.calculos;

import com.alura.conversordemoneda.principal.conexionApi.ConsultaDeMonedas;
import com.alura.conversordemoneda.principal.modelo.*;
import java.util.Scanner;

public class calculosDeMonedas {

    public void calcularConversion(String monedaBase, String monedaObjetivo, Scanner teclado){

        double monto;
        double montoTotal;

        ConsultaDeMonedas consultar = new ConsultaDeMonedas();

        System.out.println("\nIngresa el monto que desea convertir:");

        try {
            monto = Double.parseDouble(teclado.next());

            if (monto <= 0){
                System.out.println("El monto debe ser mayor que cero.");
                return;
            }

            Monedas monedas = consultar.buscarMoneda(monedaBase, monedaObjetivo);

            monedasModelo moneda = new monedasModelo(monedas);

            montoTotal = monto * moneda.getTasaDeCambio();

            System.out.println("\nEl valor %.2f[%s] corresponde al valor final de: %.2f[%s]\n"
                    .formatted(monto, monedaBase, montoTotal, monedaObjetivo));

        }catch (NumberFormatException e){
            System.out.println("El valor ingresado " + teclado.next() + " no es un numero valido.");
        }catch (Exception e){
            System.out.println("Ocurrio un Erro al realizar la conversion: " + e.getMessage());
        }
    }
}
