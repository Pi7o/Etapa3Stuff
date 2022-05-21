package level_01;

import java.io.*;
/**
 * 
 * Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías).
Input (Entrada):
3
3
Output (Salida):
3 elevado a 3 = 27
 */
public class Ejercicio06 {
    //shameless ctrl+c and ctrl+v from ej5
    public static int MultiplicoAca(int argumento,int argumento2){
        int a = argumento;
        int b = argumento2;
        int resultadofinal = a;
        //sumo a si mismo hasta que i sea mayor o igual a b
        for (int i=1; i<b;i++ ){
            resultadofinal+=a;
        }
        return resultadofinal;
    }
    public static void main(String[] args) throws IOException{
        System.out.print("Ingrese 2 numeros enteros separados por espacio, segundo siendo potencia:");
        // Preparo para leer
        BufferedReader aquileo = new BufferedReader(new InputStreamReader(System.in)) ;
        //aca leo
        String entrada = aquileo.readLine();
        //aca separo
        String[] separado = entrada.split(" ") ;
        System.out.println("Los numeros ingresados son: ");
        for (String x : separado ){
            System.out.println(": "+x);
        } ;    
        int a = Integer.parseInt(separado[0]);
        int b = Integer.parseInt(separado[1]);
        int guardoaca = a;
        // si es 0, solo pongo que sea 1 la salida
        if (b==0) {
            guardoaca = 1;
        }
        // multiplico por si mismo usando funcion del ejercicio 5 hasta que i sea mayor u igual a b
        for (int i=1; i<b;i++ ){
            guardoaca=MultiplicoAca(guardoaca, a);
        }
        String estoescribo = "El resultado de la potencia es: ";
        String resultadotexto = String.valueOf(guardoaca);
        if (a == 0 && b == 0){
            resultadotexto = "Indefinido!";
        }
        System.out.println(estoescribo+resultadotexto);
    }
}
