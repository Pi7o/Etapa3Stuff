package level_02;

import java.util.ArrayList;

/*
 Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición).
*/
public class Ejercicio02 {
    public static void main(String[] args) {
        ArrayList<Integer> listaenteros = new ArrayList<Integer>();
        for (int i=1; i<6;i++){
            listaenteros.add(i);
        }
        System.out.println(listaenteros);
        // muevo ultimo elemento para dar espacio y añado un "0" a inicio de lista
        listaenteros.add(listaenteros.get(listaenteros.size()-1));
        for (int i = listaenteros.size()-1; 0<i;i--){
            listaenteros.set(i, listaenteros.get(i-1));
        }
        listaenteros.set(0, 0);
        listaenteros.add(6);
        System.out.println(listaenteros);
    }
}
