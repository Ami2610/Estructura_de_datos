import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Números = " + numeros);

        for(int i = numeros.size() - 1; i <= 0; i--) {
            if(numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }

        System.out.println("Numeros impares: " + numeros);

    }
}
