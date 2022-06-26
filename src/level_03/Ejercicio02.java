package level_03;

import java.util.ArrayList;
import java.util.List;
/*Dada una lista que contiene números enteros, se deberá generar otra lista que
contendrá el resultado de aplicar la operación de potencia a 2.
Input (Entrada):
List<Integer> palabras = List.of(1, 2, 3, 4, 5);Output (Salida):
[1, 4, 9, 16, 25] */
public class Ejercicio02 {
    public static void main(String[] args){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        List<Integer> salida = new ArrayList<>();
        numeros.stream().forEach(n -> salida.add(n*n));
        //No tenia claro para que era obligatorio usar streams aqui lol x2

        System.out.println(salida);
        
    }
    
}
