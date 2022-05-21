package level_01;
import java.io.*;
/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada.
Input (Entrada):
Hola Informatorio Java 2022.
a
Output (Salida):
4
*/
public class Ejercicio09 {
    public static void main(String[] args) throws IOException{
         // Preparo para leer
         BufferedReader aquileo = new BufferedReader(new InputStreamReader(System.in)) ;
         //aca leo caracter a contar
         System.out.print("Escriba letra a contar :");
         char letra = (aquileo.readLine().charAt(0));
         
         //aca leo entrada
         System.out.print("Escriba su texto :");
         String entrada = aquileo.readLine();
         char[] temp = entrada.toCharArray();
         int contador = 0;
         for (char i : temp ){
            if (i == letra){
                contador++;
            }
         }
        String salida = String.format("La letra %s se repite: %d veces",letra,contador);
        System.out.println(salida);

    }    
}
