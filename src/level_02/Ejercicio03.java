package level_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, existe algún método
que me permita hacer la operación sort (mezclar) aleatoriamente? Idem
para el reverso
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja_int = new ArrayList<Integer>();
        for (int i= 1; i<53; i++) baraja_int.add(i);
        System.out.println("Antes: ");
        System.out.println(baraja_int);
        System.out.println("Reverso: ");
        Collections.reverse(baraja_int);
        System.out.println(baraja_int);
        Collections.shuffle(baraja_int, new Random());
        System.out.println("Despues de mesclar: ");
        System.out.println(baraja_int);
    }
    
}
