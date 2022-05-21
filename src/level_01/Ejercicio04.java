package level_01;
import java.io.*;

/*
 Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
Input (Entrada):
5
Output (Salida):
El factorial de 5 es: 120
*/

public class Ejercicio04 {
    // Copie y pegue lo que ya hize de recursividad la clase pasada
    public static int Factorial(int argumento){
        //caso de salida
        if (argumento <= 1){
            return 1;
        }
        //caso iterativo
        else {
            int acarreo=argumento-1;
            return argumento * Factorial(acarreo);
        }
        
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Ingrese un solo numero entero del cual obtener factorial :");
        // Preparo para leer
        BufferedReader aquileo = new BufferedReader(new InputStreamReader(System.in)) ;
        //aca leo
        String entrada = aquileo.readLine();
        int entrada_numero = Integer.parseInt(entrada);
        //llamo funcion recursiva
        int b = Ejercicio04.Factorial(entrada_numero) ;
        System.out.println(String.format("El factorial de %s es: %d", entrada, b));

    }
}