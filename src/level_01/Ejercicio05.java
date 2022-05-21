package level_01;
import java.io.*;
/*
Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías).
Input (Entrada):
2
3
Output (Salida):
2 x 3 = 6
*/

public class Ejercicio05 {
    public static int MultiplicoAca(int argumento,int argumento2){
        if (argumento2 == 0){
            return 0;
        }
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
        int guardoaca = MultiplicoAca(a, b);
        
        System.out.println("El resultado de la multiplicacion es: "+ guardoaca);
    }
    
}
