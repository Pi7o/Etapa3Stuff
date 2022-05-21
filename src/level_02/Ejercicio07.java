package level_02;
/**
Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
Input (Entrada):
fizzBuzzFuncion(1,6) // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)
Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”][“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]
 */
public class Ejercicio07 {
    public static String[] fizzBuzzFuncion(int a, int b){
        String salida = "";
        String temp = "";
        for (int i=a; i<b-1;i++){
            temp = String.valueOf(i);
            if (i % 2 == 0) temp = "Fizz"; 
            if (i % 3 == 0) temp = "Buzz";
            if (i % 2 == 0 && i % 3 == 0) temp = "FizzBuzz"; 
            salida=salida+" "+temp;
        }
        salida = salida+" "+String.valueOf(b-1);
        System.out.println(salida);
        return salida.split(" ");
    }

    public static void main(String[] args) {
        String[] xd = fizzBuzzFuncion(1, 8);
        //Para Escribir por pantalla asi compruebo, lo recorro con un foreach
        System.out.print("[");  
        for (String string : xd) {
            System.out.print(" "+string);            
        }
        System.out.print(" ]"); 
        System.out.println();
    }
}
