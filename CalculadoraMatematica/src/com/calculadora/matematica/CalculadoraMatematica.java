package com.calculadora.matematica;

import java.util.Scanner;

/**
 * Clase: CalculadoraMatematica
 * 
 * Descripción:
 * Esta clase permite realizar operaciones matemáticas básicas entre dos números:
 * suma, resta, multiplicación y división. Además, cuenta con un menú interactivo
 * que permite al usuario ingresar los valores y seleccionar la operación deseada.
 * 
 * Autor: cesar
 */
public class CalculadoraMatematica {

    // Atributos privados que almacenan los números ingresados por el usuario
    private double num1;
    private double num2;

    /**
     * Constructor por defecto.
     * Inicializa los valores num1 y num2 en cero.
     */
    public CalculadoraMatematica() {
        this.num1 = 0;
        this.num2 = 0;
    }

    /**
     * Método para asignar valores a los números de la calculadora.
     * 
     * @param num1 Primer número ingresado por el usuario
     * @param num2 Segundo número ingresado por el usuario
     */
    public void calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Realiza la suma de los dos números.
     * 
     * @return Resultado de la suma (num1 + num2)
     */
    public double suma() {
        return num1 + num2;
    }

    /**
     * Realiza la resta entre los dos números.
     * 
     * @return Resultado de la resta (num1 - num2)
     */
    public double resta() {
        return num1 - num2;
    }

    /**
     * Realiza la división entre los dos números.
     * 
     * Si el segundo número es cero, se muestra un mensaje de error
     * y se devuelve el valor 0 para evitar una excepción.
     * 
     * @return Resultado de la división (num1 / num2)
     */
    public double division() {
        if (num2 == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        }
        return num1 / num2;
    }

    /**
     * Realiza la multiplicación entre los dos números.
     * 
     * @return Resultado de la multiplicación (num1 * num2)
     */
    public double multiplicacion() {
        return num1 * num2;
    }

    /**
     * Método principal (main).
     * 
     * Muestra un menú interactivo que permite al usuario:
     *  - Ingresar dos números
     *  - Realizar operaciones básicas (suma, resta, multiplicación, división)
     *  - Salir del programa
     * 
     * Se incluye validación para evitar errores al ingresar opciones no numéricas.
     * 
     * @param args Argumentos de línea de comando (no se usan)
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        int opcion;
        double num1;
        double num2;

        do {
            System.out.println("\n--- MENÚ CALCULADORA ---");
            System.out.println("1. Ingresar números");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            // Validar que la entrada sea un número entero
            while (!entrada.hasNextInt()) {
                System.out.println("Error. Debes ingresar una opción válida.");
                entrada.next(); // limpiar entrada incorrecta
                System.out.print("Seleccione una opción: ");
            }

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = entrada.nextDouble();
                    calculadora.calculadora(num1, num2);
                    break;

                case 2:
                    System.out.println("Resultado de la suma: " + calculadora.suma());
                    break;

                case 3:
                    System.out.println("Resultado de la resta: " + calculadora.resta());
                    break;

                case 4:
                    System.out.println("Resultado de la multiplicación: " + calculadora.multiplicacion());
                    break;

                case 5:
                    System.out.println("Resultado de la división: " + calculadora.division());
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 0);

        entrada.close();
    }
}