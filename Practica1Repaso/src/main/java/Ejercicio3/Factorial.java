package Ejercicio3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Factorial {

    // Método para factorizar un número en sus factores primos
    public static List<Integer> factorizar(int numero) {
        List<Integer> factoresPrimos = new ArrayList<>();

        // Factorizar el 2 (el primer número primo)
        while (numero % 2 == 0) {
            factoresPrimos.add(2);
            numero /= 2;
        }

        // Factorizar los números impares a partir del 3
        for (int i = 3; i * i <= numero; i += 2) {
            while (numero % i == 0) {
                factoresPrimos.add(i);
                numero /= i;
            }
        }

        // Si el número es mayor que 2, entonces es un número primo
        if (numero > 2) {
            factoresPrimos.add(numero);
        }

        return factoresPrimos;
    }

    public static void main(String[] args) {
        try {
            // Crear un objeto BufferedReader para leer la entrada por teclado
            BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));

            // Solicitar al usuario que ingrese un número
            System.out.print("Introduce un número para factorizar: ");
            int numero = Integer.parseInt(myInput.readLine());  // Leer el número ingresado por el usuario

            // Llamar al método de factorización
            List<Integer> factores = factorizar(numero);

            // Mostrar los factores primos
            System.out.println("Los factores primos de " + numero + " son: " + factores);

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
