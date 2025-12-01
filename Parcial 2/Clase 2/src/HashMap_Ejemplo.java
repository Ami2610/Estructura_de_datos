import java.util.HashMap;

public class HashMap_Ejemplo {
    public static void main(String[] args) {

        HashMap<String, Double> calificaciones =
                new HashMap<>();

        calificaciones.put("Jostin", 40.0);
        calificaciones.put("Jersson", 50.0);
        calificaciones.put("Argei", 25.0);
        calificaciones.put("Jorel", 30.0);

        System.out.println("Calificaciones (sin actualizar): " + calificaciones);

        String estudianteBuscado = "Jostin";
        System.out.println("Calificación de: " + estudianteBuscado +
                " : " + calificaciones.get(estudianteBuscado));

        calificaciones.put("Matias", 30.0);
        System.out.println("Calificaciones actualizadas: " + calificaciones);
    }
}
