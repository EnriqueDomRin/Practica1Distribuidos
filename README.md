# Practica1Distribuidos
PRIMERA PRÁCTICA SISTEMAS DISTRIBUIDOS. 

Práctica 1.1

Crear un programa en java que dadas tres longitudes nos diga si con ellas es posible construir un triángulo. Si fuese cierto nos diga de que tipo es y calcule el perímetro del mismo. Parte extra: crear un programa que calcule el área de dicho triángulo. 

Práctica 1.2 

Crear un programa en java para el cálculo del IBAN de una cuenta de banco Como ejemplo partiendo de que el IBAN en España consta de 24 dígitos, y que los cuatro primeros sirven para identificar el país de origen y como mecanismo de control, el cálculo del código IBAN es sencillo: Escribe “ES00” y a continuación el Código Cuenta Cliente. Para no equivocarte, comprueba que te haya dado un código formado por 24 caracteres. Coloca el “ES00” al final del Código Cuenta Cliente, y cambia las dos primeras letras por números: Sustituye la “E” por el 14 y la “S” por el 28. Ahora tendrás un número de 24 dígitos que acabará en “142800”, y si utilizamos el ejemplo de CCC anterior, habrá quedado el siguiente código: “01234567891234567890142800”. Coge tu calculadora y divide este número de 24 dígitos por 97, y al resto o residuo de ese cociente réstale 98. Hecha esta operación, el resultado mostrará el dígito de control en dos cifras, que te permitirá saber el IBAN de una cuenta. Para otros países El Cálculo se llevará a cabo de la siguiente forma: Paso preliminar: Crear un código previo de IBAN compuesto del código de país (ES) seguido de “00” y el C.C.C. Ejemplo: ES0000120345030000067890 

Paso 1: Trasladar los cuatro primeros caracteres del IBAN a la derecha del Código: Resultado: 00120345030000067890ES00 

Paso 2: Convertir las letras en números aplicando: E = 14; S = 28. Resultado: 00120345030000067890142800 La conversión de letras por números, para el caso de IBAN de otros países se acomoda a la siguiente tabla: 

                        A = 10 B=11 C=12 D=13 E=14 F=15 G=16 H=17 I=18 J=19 K=20 L=21 M=22 N=23 O=24 P=25 Q=26 R=27 S=28 T=29 U=30 V=31 W=32 X=33 Y=34 Z=35 

Paso 3: Aplicar el módulo 97. Calculando el módulo 97 (resto de la división por 97 del IBAN creado) y estableciendo la diferencia entre 98 y el resto. Si el resultado es un dígito, anteponer un cero. 98 – 91= 7 El IBAN creado sería: IBAN ES07 0012 0345 03 0000067890

OBVS: Para el caso de JAVA es necesario el uso de la clase BigIngeter incluida en el paquete java.math. 


Práctica 1.3 

Crear un programa en Java que factorice un número que le indiquemos en factores primos 


Práctica 1.4 

Crear un programa en Java para convertir un número dado en cualquiera de los formatos decimal, binario, octal y hexadecimal a los formatos decimal, binario, octal y hexadecimal.
