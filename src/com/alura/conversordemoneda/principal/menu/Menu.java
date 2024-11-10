package com.alura.conversordemoneda.principal.menu;

import com.alura.conversordemoneda.principal.calculos.calculosDeMonedas;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        calculosDeMonedas mostrar = new calculosDeMonedas();

        int opcion = 0;

        String menu = """
                ***********************************************************
                
                "CONVERSOR DE MONEDAS ALURA"
                
                Seleccione la moneda que desea convertir:
                
                1: Peso Argentinos ==> Dolares
                2: Dolares ==> Peso Argentinos
                
                3: Real Brasilenio ==> Dolares
                4: Dolares ==> Real Brasilenio
                
                5: Peso Mexicano ==> Dolares
                6: Dolares ==> Peso Mexicano
                
                7: Peso Colombiano ==> Dolares
                8: Dolares ==> Peso Colombiano
                9: Salir
                
                ***********************************************************
                """;
        while (opcion != 9){

            System.out.println(menu);
            
            System.out.println("Selecciona una de la siguiente opciones");

            try {

                opcion = Integer.parseInt(teclado.next());

                switch (opcion){

                    case 1 -> {

                        System.out.println("\nSelecionaste la opcion Peso Argentino a Dolares");
                        mostrar.calcularConversion("ARS","USD", teclado);

                    }

                    case 2 -> {
                        System.out.println("\nSelecionaste la opcion Dolares a Peso Argentinos");
                        mostrar.calcularConversion("USD","ARS", teclado);

                    }

                    case 3 -> {
                        System.out.println("\nSelecionaste la opcion Real Brasilenio a Dolares");
                        mostrar.calcularConversion("BRL","USD", teclado);

                    }

                    case 4 -> {
                        System.out.println("\nSelecionaste la opcion Dolares a Real Brasilenio");
                        mostrar.calcularConversion("USD","BRL", teclado);

                    }

                    case 5 -> {
                        System.out.println("\nSelecionaste la opcion Peso Mexicano a Dolares");
                        mostrar.calcularConversion("MXN","USD", teclado);

                    }

                    case 6 -> {
                        System.out.println("\nSelecionaste la opcion Dolares a Peso Mexicano");
                        mostrar.calcularConversion("USD","MXN", teclado);

                    }

                    case 7 -> {
                        System.out.println("\nSelecionaste la opcion Peso Colombiano a Dolares");
                        mostrar.calcularConversion("COP","USD", teclado);

                    }

                    case 8 -> {
                        System.out.println("\nSelecionaste la opcion Dolares a Peso Colombiano");
                        mostrar.calcularConversion("USD","COP", teclado);

                    }

                    case 9 -> {
                        System.out.println("\nSelecionaste Salir");
                        System.out.println("Saliendo del programa");

                    }

                    default -> {
                        System.out.println("\nOpcion no valida");

                    }

                }

            }catch (NumberFormatException e){

                System.out.println("Erro: por favor, ingrese un numero valido.");

            }catch (InputMismatchException e){

                System.out.println("Ocurrio un error. por favor, ingrese un numero.");
                teclado.next();
            }

        }

        teclado.close();

    }
}