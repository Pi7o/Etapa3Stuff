package level_01;
import java.io.*;

/*
Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números.
*/
public class Ejercicio02 {
    public static void main(String[] args) throws IOException{
        System.out.print("Ingrese 2 numeros enteros separados por espacio :");
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
        System.out.println("El resultado de la suma es: "+(a+b));
        System.out.println("El resultado de la resta es: "+(a-b));
        System.out.println("El resultado de la multiplicacion es: "+(a*b));
        System.out.println("El resultado de la division es: "+(a/b));
        System.out.println("El resultado del modulo es: "+(a % b));

    }
}
