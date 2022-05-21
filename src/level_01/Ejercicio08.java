package level_01;
import java.io.*;
/*
Crear una aplicación que solicite de entrada los datos de una persona en este
orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
Input (Entrada):
Homero Simpson
48
Calle Falsa 1234
Springfield
Output (Salida):
Springfield - Calle Falsa 1234 - 48 - Homero Simpson
*/
public class Ejercicio08 {
    public static void main(String[] args) throws Exception{
        // Preparo para leer
        BufferedReader aquileo = new BufferedReader(new InputStreamReader(System.in)) ;
        //aca leo nombre y apellido
        System.out.print("Escriba su nombre y apellido :");
        String nya = aquileo.readLine();

        //aca leo edad
        System.out.print("Escriba su edad :");
        String edad = aquileo.readLine();

        //aca leo direccion
        System.out.print("Escriba su direccion :");
        String direccion = aquileo.readLine();

        //aca leo ciudad
        System.out.print("Escriba su ciudad :");
        String ciudad = aquileo.readLine();

                
        //aca imprimo
        String salida = String.format("%s - %s - %s - %s",ciudad, direccion, edad, nya);
        System.out.println(salida);
            
    }
}
