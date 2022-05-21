package level_02;

import java.util.ArrayList;

/**
 * Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        ArrayList<String> nombres_estudiantes = new ArrayList<String>();
        nombres_estudiantes.add("pepito");
        nombres_estudiantes.add("juan");
        nombres_estudiantes.add("luca");
        nombres_estudiantes.add("maria");
        nombres_estudiantes.add("paula");
        nombres_estudiantes.add("juana");
        nombres_estudiantes.add("lala");
        nombres_estudiantes.add("lele");
        nombres_estudiantes.add("lili");
        nombres_estudiantes.add("elver");
        nombres_estudiantes.add("raul");
        nombres_estudiantes.add("meme");
        ArrayList<String> clase1 = new ArrayList<String>(nombres_estudiantes.subList(0, 4));
        ArrayList<String> clase2 = new ArrayList<String>(nombres_estudiantes.subList(4, 8));
        ArrayList<String> clase3 = new ArrayList<String>(nombres_estudiantes.subList(8, 12));
        System.out.println("Todos los estudiantes: "+nombres_estudiantes);
        System.out.println("Clase 1: "+clase1);
        System.out.println("Clase 2: "+clase2);
        System.out.println("Clase 3: "+clase3);
    }
}
