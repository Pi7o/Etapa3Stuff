package level_03;

import java.util.List;
/*Se dispone de una lista de Strings, de la cual saber la cantidad de valores que
comiencen con la letra B (tanto mayúscula como minúscula, en ese caso
decimos que será ignoreCase).
Input (Entrada):
List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
"Wonder Woman", "brainiac",);
Output (Salida):
3 */
public class Ejercicio03 {
    public static void main(String[] args){
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        List<String> salida = palabras.stream()
            .filter(e -> Character.toUpperCase(e.charAt(0))=='B')
            .toList();
        System.out.println(salida.size());
        
    }
}
