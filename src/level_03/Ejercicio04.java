package level_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;
/*Se dispone de una lista de Integer, de la cual queremos obtener otra lista
aplicando la operación de factorial pero no se desean valores repetidos.
Input (Entrada)
List<Integer> palabras = List.of(1, 2, 4, 4, 4);
Output (Salida):
[1, 2, 24] */
public class Ejercicio04 {
    public static void main(String[] args){
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        List<Long> salida = new ArrayList<>();
        numeros.stream()
            .distinct()
            .forEach(n -> salida.add(
                LongStream.rangeClosed(1, n)
                    .reduce(1, (long a, long b)-> a*b)
                ));
        //No tenia claro para que era obligatorio usar streams aqui lol x2

        System.out.println(salida);
        
    }
}
