import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void agregarEstudiante(Scanner sc) {
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el ID: ");
        String id = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, id);
        listaEstudiantes.add(estudiante);

        System.out.println("Estudiante agregado con éxito");
    }

    public static void mostrarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados");
            return;
        }

        System.out.println("\nLISTA DE ESTUDIANTES");
        for (Estudiante e : listaEstudiantes) {
            System.out.println(e);
        }
    }

    public static void buscarEstudiante(Scanner sc) {
        System.out.println("Buscar por nombre o ID: ");
        String busqueda = sc.nextLine();

        for (Estudiante e : listaEstudiantes) {
            if (e.getNombre().equalsIgnoreCase(busqueda) ||
                    e.getId().equalsIgnoreCase(busqueda)) {
                System.out.println("Encontrado " + e);
                return;
            }
        }
        System.out.println("Estudiante no encontrado");
    }

    public static void eliminarEstudiante(Scanner sc) {
        System.out.println("Buscar y eliminar por nombre o ID: ");
        String busqueda = sc.nextLine().trim();

        for (Estudiante e : listaEstudiantes) {
            if (e.getNombre().equalsIgnoreCase(busqueda) || e.getId().equalsIgnoreCase(busqueda)) {
                listaEstudiantes.remove(e);
                System.out.println("Estudiante eliminado con éxito.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    public static void registrarMateria(Scanner sc) {
        System.out.println("Ingrese nombre de la materia a registrar: ");
        String materia = sc.nextLine().trim();
        catalogoMaterias.add(materia);
        System.out.println("Materia registrada con éxito.");
    }

    public static void verificarMateria(Scanner sc) {
        System.out.println("Ingrese nombre de la materia a verificar: ");
        String materia = sc.nextLine().trim();

        if (catalogoMaterias.contains(materia)) {
            System.out.println("La materia " + materia + " está registrada.");
        } else {
            System.out.println("La materia " + materia + " no está registrada.");
        }
    }

    public static void contarMaterias() {
        System.out.println("Cantidad de materias registradas: " + catalogoMaterias.size());
    }

    public static void agregarCalificacion(Scanner sc) {
        System.out.println("Buscar al estudiante por nombre o ID para agregar calificación: ");
        String busqueda = sc.nextLine().trim();

        for (Estudiante e : listaEstudiantes) {
            if (e.getNombre().equalsIgnoreCase(busqueda) || e.getId().equalsIgnoreCase(busqueda)) {
                System.out.println("Ingrese calificación para " + e.getNombre() + " (" + e.getId() + "): ");
                double calificacion = sc.nextDouble();
                sc.nextLine(); // Para consumir el salto de línea

                registroCalificaciones.putIfAbsent(e.getId(), new ArrayList<>());
                registroCalificaciones.get(e.getId()).add(calificacion);
                System.out.println("Calificación agregada con éxito.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    public static void calcularPromedio(Scanner sc) {
        System.out.println("Buscar al estudiante por nombre o ID para calcular el promedio: ");
        String busqueda = sc.nextLine().trim();
        Estudiante estudiante = null;
        for (Estudiante e : listaEstudiantes) {
            if (e.getNombre().equalsIgnoreCase(busqueda) || e.getId().equalsIgnoreCase(busqueda)) {
                estudiante = e;
                break;
            }
        }

        if (estudiante == null) {
            System.out.println("Estudiante no encontrado.");
            return;
        }

        // Obtener las calificaciones del estudiante
        ArrayList<Double> calificaciones = registroCalificaciones.get(estudiante.getId());
        if (calificaciones == null || calificaciones.isEmpty()) {
            System.out.println("No se han registrado calificaciones para este estudiante.");
        } else {
            double promedio = calificaciones.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            System.out.println("El promedio de " + estudiante.getNombre() + " (" + estudiante.getId() + ") es: " + promedio);
        }
    }

    // CREACIÓN DE LISTAS

    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    private static HashSet<String> catalogoMaterias = new HashSet<>();

    private static HashMap<String, ArrayList<Double>> registroCalificaciones = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Registrar materia");
            System.out.println("6. Verificar materia");
            System.out.println("7. Contar materias");
            System.out.println("8. Agregar calificación");
            System.out.println("9. Calcular promedio");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1 -> agregarEstudiante(sc);
                case 2 -> mostrarEstudiantes();
                case 3 -> buscarEstudiante(sc);
                case 4 -> eliminarEstudiante(sc);
                case 5 -> registrarMateria(sc);
                case 6 -> verificarMateria(sc);
                case 7 -> contarMaterias();
                case 8 -> agregarCalificacion(sc);
                case 9 -> calcularPromedio(sc);
                case 0 -> {
                    System.out.println("Gracias por usar nuestro sistema");
                    sc.close();  // Cerramos el scanner al salir
                    return;  // Salir del programa
                }
                default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
        while (opcion != 0);
    }
}
