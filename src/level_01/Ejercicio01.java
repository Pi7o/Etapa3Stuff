package level_01;
import java.io.*;
/*
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
mensaje “HOLA {USUARIO}!!!”
Input (Entrada):
Obi Wan Kenobi
Output (Salida):HOLA Obi Wan Kenobi!!!
*/
public class Ejercicio01 {
    public static void main(String[] args) throws IOException{
        System.out.print("Escriba su nombre :");
        // Preparo para leer
        BufferedReader aquileo = new BufferedReader(new InputStreamReader(System.in)) ;
        //aca leo
        String entrada = aquileo.readLine();
        //aca imprimo
        String salida = String.format("Hola %s!!!", entrada);
        System.out.println(salida);
    }    
}
