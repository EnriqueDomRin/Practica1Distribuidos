package Ejercicio2;

import java.math.BigInteger;

public class IbanBanco {

    // Mapa para convertir las letras a números según la tabla proporcionada
    public static int convertirLetraANumero(char letra) {
        // Convertir la letra a su número correspondiente según la tabla
        // A = 10, B = 11, ..., Z = 35
        if (letra >= 'A' && letra <= 'Z') {
            return 10 + (letra - 'A');
        } else {
            throw new IllegalArgumentException("Caracter no válido: " + letra);
        }
    }

    // Método para calcular el IBAN
    public static String calcularIban(String codigoCuentaCliente) {
        // Paso 1: Crear el código preliminar
        String codigoPreliminar = "ES00" + codigoCuentaCliente;

        // Paso 2: Trasladar los primeros 4 caracteres del código (ES00) al final
        String codigoReordenado = codigoCuentaCliente + "ES00";

        // Paso 3: Convertir las letras "ES" en números
        StringBuilder codigoConNumeros = new StringBuilder();
        for (int i = 0; i < codigoReordenado.length(); i++) {
            char caracter = codigoReordenado.charAt(i);
            if (Character.isLetter(caracter)) {
                // Convertir letras a números según la tabla
                codigoConNumeros.append(convertirLetraANumero(caracter));
            } else {
                // Los números se agregan tal cual
                codigoConNumeros.append(caracter);
            }
        }

        // Crear un objeto BigInteger con el código convertido a número
        BigInteger codigoIban = new BigInteger(codigoConNumeros.toString());

        // Paso 4: Calcular el módulo 97
        BigInteger modulo97 = codigoIban.mod(BigInteger.valueOf(97));

        // Paso 5: Calcular el dígito de control (98 - módulo 97)
        int digitoControl = 98 - modulo97.intValue();

        // Si el resultado es menor a 10, anteponer un 0
        String digitoControlStr = String.format("%02d", digitoControl);

        // El IBAN completo es el código "ES" seguido del dígito de control y el CCC
        return "ES" + digitoControlStr + codigoCuentaCliente;
    }

    public static void main(String[] args) {
        // Código Cuenta Cliente (CCC) de ejemplo
        String codigoCuentaCliente = "00120345030000067890";

        // Calcular el IBAN
        String iban = calcularIban(codigoCuentaCliente);

        // Mostrar el resultado
        System.out.println("El IBAN calculado es: " + iban);
    }
}

