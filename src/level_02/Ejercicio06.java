package level_02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Se dispone de una colección de Empleados, de cada empleado se conoce:
○ Nombre y Apellido nya
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.
 */

// una clase muy simple y sin encapsulamiento unicamente para realizar el ejercicio, terrible
class Empleado {
    public String nya;
    public int dni;
    public int horasTrabajadas;
    public int valorPorHora;

    public Empleado(int dni, String nya, int horasTrabajadas, int valorPorHora){
        this.nya = nya;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.valueOf(this.dni)+
            " - "+this.nya;
    }
}

public class Ejercicio06 {
    

    public static void main(String[] args) {
        //Inicializo el hashset
        Set<Empleado> empleados = new HashSet<Empleado>();
        //Inicializar HashMap
        Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();
        //Cargo Empleados de prueba
        empleados.add(new Empleado(12345678, "Marco", 6, 200));
        empleados.add(new Empleado(22345678, "Polo", 8, 300));
        //Cargo sueldos
        for (Empleado i : empleados) {
            sueldos.put(i.dni, (i.horasTrabajadas*i.valorPorHora));
        }

       
        System.out.println("Sueldo para dni 22345678: "+sueldos.get(22345678));
    }
}
