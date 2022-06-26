package level_03;

import java.util.ArrayList;
import java.util.List;
/*Dada una lista que contiene valores de tipo String, se deberá filtrar todos los
valores que NO sean null o vacío ("").
Input (Entrada):
List<String> palabras = new ArrayList<>();
palabras.add("Hola");
palabras.add(null);
palabras.add("Informatorio");
palabras.add("");
Output (Salida):
["Hola", "Informatorio"] */
public class Ejercicio01 {

    public static void main(String[] args){
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("");
        palabras.add("Informatorio");
        palabras.add("");
    
        List<String> salida = palabras.stream()
            .filter(e -> !(e==null || e.isEmpty()))
            .toList();
        //No tenia claro para que era obligatorio usar streams aqui lol
        System.out.println(salida);
        
    }
}