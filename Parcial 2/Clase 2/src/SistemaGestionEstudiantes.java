import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SistemaGestionEstudiantes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);;

        HashMap <String, ArrayList<Double>> estudiantes = new HashMap<>();

        while (true){
            try{
                System.out.println("--- SISTEMA DE GESTION ---");
                System.out.println("1. Agregar estudiantes");
                System.out.println("2. Agregar calificación");
                System.out.println("3. Ver promedio del estudiante");
                System.out.println("4. Salir");
                System.out.println("SELECCIONE UNA OPCIÓN");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del estudiante ");
                        String nombre = scanner.nextLine();
                        if (estudiantes.containsKey(nombre)) {
                            System.out.println("El estudiante ya exite");

                        }else {
                            estudiantes.put(nombre, new ArrayList<>());
                            System.out.println("Estudiante agregado con éxito");

                        }break;
                }
            }
        }
    }
}
