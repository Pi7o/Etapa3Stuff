package level_02;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking
Input (Entrada):
Bariloche
Córdoba
Resistencia
Output (Salida):
#1 - Ushuaia
#2 - Rio Grande
#3 - Tolhuin
#4 - Villa Carlos Paz
*/
public class Ejercicio01 {
    public static void main(String[] args) throws Exception{
        System.out.print("Ingrese sus provincias favoritas separadas por un ¨-¨ :");
        // Preparo para leer
        BufferedReader aquileo = new BufferedReader(new InputStreamReader(System.in)) ;
        //aca leo
        String entrada = aquileo.readLine();
        //aca separo
        String[] separado = entrada.split("-") ;
        ArrayList<String> ciudades= new ArrayList<String>();
        for (String x : separado ){
            ciudades.add(x);
        } ;    

        String salida = "";
        for (int i = 0 ; i<ciudades.size();i++){
            salida = String.format("#%s - %s",(i+1),ciudades.get(i));
            System.out.println(salida);
        }
    }
}
