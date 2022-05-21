package level_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.
Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
## Los arrays son iguales y corresponden a los días trabajados de una
semana Lun-Vie.
Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915
 */
public class Ejercicio05 {
    public static void main(String[] args) throws IOException{
        // Preparo para leer
        BufferedReader aquileo = new BufferedReader(new InputStreamReader(System.in)) ;
        
        //aca leo horas trabajadas
        System.out.print("Ingrese sus horas trabajadas separadas por un ¨-¨: ");
        String entrada = aquileo.readLine();
        //aca separo horas trabajadas
        ArrayList<Integer> lista_horas= new ArrayList<Integer>();
        for (String x : entrada.split("-") ){
            lista_horas.add(Integer.valueOf(x));
        } ;
        //aca leo valor de horas trabajadas
        System.out.print("Ingrese valor por horas trabajadas separadas por un ¨-¨: ");
        entrada = aquileo.readLine();
        //aca separo valor de horas trabajadas
        ArrayList<Integer> lista_valor= new ArrayList<Integer>();
        for (String x : entrada.split("-") ){
            lista_valor.add(Integer.valueOf(x));
        } ;     
        if (lista_horas.size() != lista_valor.size()){
            System.out.print("Tamaño de listas no iguales!!");
            return ;
        }
        //aca preparo salida
        ArrayList<Integer> lista_salida = new ArrayList<Integer>();
        for (int i=0 ; i<lista_horas.size();i++){
            lista_salida.add((lista_horas.get(i)*lista_valor.get(i)));
        }
        System.out.println(lista_horas);
        System.out.println(lista_valor);
        System.out.println(lista_salida);
    }
}
