package Ejercicio4;

import java.io.*;

public class ConvertirFormato {

    // Método para convertir un número en decimal a binario
    public static String decimalABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    // Método para convertir un número en decimal a octal
    public static String decimalAOctal(int numero) {
        return Integer.toOctalString(numero);
    }

    // Método para convertir un número en decimal a hexadecimal
    public static String decimalAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para convertir un número binario a decimal
    public static int binarioADecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }

    // Método para convertir un número octal a decimal
    public static int octalADecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    // Método para convertir un número hexadecimal a decimal
    public static int hexadecimalADecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }

    public static void main(String[] args) {
        try {
            // Crear un objeto BufferedReader para leer la entrada por teclado
            BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Selecciona el formato de entrada:");
            System.out.println("1. Decimal");
            System.out.println("2. Binario");
            System.out.println("3. Octal");
            System.out.println("4. Hexadecimal");
            System.out.print("Opción (1-4): ");
            int opcion = Integer.parseInt(myInput.readLine());

            System.out.print("Introduce el número a convertir: ");
            String input = myInput.readLine().trim();

            if (opcion == 1) {  // Entrada en formato decimal
                int numeroDecimal = Integer.parseInt(input);

                System.out.println("Número en binario: " + decimalABinario(numeroDecimal));
                System.out.println("Número en octal: " + decimalAOctal(numeroDecimal));
                System.out.println("Número en hexadecimal: " + decimalAHexadecimal(numeroDecimal));
            } else if (opcion == 2) {  // Entrada en formato binario
                int numeroDecimal = binarioADecimal(input);

                System.out.println("Número en decimal: " + numeroDecimal);
                System.out.println("Número en octal: " + decimalAOctal(numeroDecimal));
                System.out.println("Número en hexadecimal: " + decimalAHexadecimal(numeroDecimal));
            } else if (opcion == 3) {  // Entrada en formato octal
                int numeroDecimal = octalADecimal(input);

                System.out.println("Número en decimal: " + numeroDecimal);
                System.out.println("Número en binario: " + decimalABinario(numeroDecimal));
                System.out.println("Número en hexadecimal: " + decimalAHexadecimal(numeroDecimal));
            } else if (opcion == 4) {  // Entrada en formato hexadecimal
                int numeroDecimal = hexadecimalADecimal(input);

                System.out.println("Número en decimal: " + numeroDecimal);
                System.out.println("Número en binario: " + decimalABinario(numeroDecimal));
                System.out.println("Número en octal: " + decimalAOctal(numeroDecimal));
            } else {
                System.out.println("Opción no válida.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
