package level_01;
import java.io.*;

/*
. Confeccionar un programa que dado un número entero como dato de entrada
imprima la secuencia de números (incrementos de 1) de la siguiente forma:

Input (Entrada):
5
Output (Salida):
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

public class Ejercicio03 {
    public static void main(String[] args) throws IOException{
        System.out.print("Ingrese un solo numero entero para iterar :");
        // Preparo para leer
        BufferedReader aquileo = new BufferedReader(new InputStreamReader(System.in)) ;
        //aca leo
        String entrada = aquileo.readLine();
        int entrada_numero = Integer.parseInt(entrada) + 1;
        String salida = "";
        for (int i = 1; i<entrada_numero;i++){
            salida = salida +" "+ i;
            System.out.println(salida);
        }

    }
    
}
