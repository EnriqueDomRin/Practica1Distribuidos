package Ejercicio1;

import java.io.*;

public class Triangulo {

    // Método para verificar si las longitudes pueden formar un triángulo
    public static boolean esTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Método para determinar el tipo de triángulo
    public static String tipoTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || b == c || a == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    // Método para calcular el perímetro
    public static double calcularPerimetro(double a, double b, double c) {
        return a + b + c;
    }

    // Método para calcular el área usando la fórmula de Herón
    public static double calcularArea(double a, double b, double c) {
        double s = (a + b + c) / 2; // semiperímetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // fórmula de Herón
    }

    public static void main(String[] args) {
        try {
            // Crear un objeto BufferedReader para leer la entrada por teclado
            BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));

            // Solicitar al usuario que ingrese las longitudes de los lados
            System.out.print("Introduce la longitud del primer lado: ");
            double a = Double.parseDouble(myInput.readLine());

            System.out.print("Introduce la longitud del segundo lado: ");
            double b = Double.parseDouble(myInput.readLine());

            System.out.print("Introduce la longitud del tercer lado: ");
            double c = Double.parseDouble(myInput.readLine());

            // Verificar si es posible formar un triángulo
            if (esTriangulo(a, b, c)) {
                System.out.println("Las longitudes pueden formar un triángulo.");

                // Determinar el tipo de triángulo
                String tipo = tipoTriangulo(a, b, c);
                System.out.println("El triángulo es: " + tipo);

                // Calcular el perímetro
                double perimetro = calcularPerimetro(a, b, c);
                System.out.println("El perímetro del triángulo es: " + perimetro);

                // Calcular el área
                double area = calcularArea(a, b, c);
                System.out.println("El área del triángulo es: " + area);
            } else {
                System.out.println("Las longitudes no pueden formar un triángulo.");
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
