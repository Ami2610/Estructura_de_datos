public class ArbolesBinariosEjercicio {

    static void imprimirArbol(Nodo nodo, int nivel) {
        if (nodo != null) {
            imprimirArbol(nodo.derecho, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print(" ");
            }
            System.out.println(nodo.dato);
            imprimirArbol(nodo.izquierdo, nivel + 1);
        }
    }

    // PREORDEN
    static void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato.trim() + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    // INORDEN
    static void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.dato.trim() + " ");
            inorden(nodo.derecho);
        }
    }

    // POSTORDEN
    static void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.print(nodo.dato.trim() + " ");
        }
    }

    public static void main(String[] args) {

        Nodo arbolVacio = null;

        // Raíz
        Nodo raiz = new Nodo("50");

        // Nivel 1
        raiz.izquierdo = new Nodo("      25");
        raiz.derecho = new Nodo("      75");

        // Nivel 2
        raiz.izquierdo.izquierdo = new Nodo("            12");
        raiz.izquierdo.derecho = new Nodo("            37");
        raiz.derecho.izquierdo = new Nodo("            62");
        raiz.derecho.derecho = new Nodo("            87");

        // Nivel 3
        raiz.izquierdo.izquierdo.izquierdo = new Nodo("                 6");
        raiz.izquierdo.izquierdo.derecho = new Nodo("                 18");
        raiz.izquierdo.derecho.izquierdo = new Nodo("                 31");
        raiz.izquierdo.derecho.derecho = new Nodo("                 43");
        raiz.derecho.izquierdo.izquierdo = new Nodo("                 56");
        raiz.derecho.izquierdo.derecho = new Nodo("                 68");
        raiz.derecho.derecho.izquierdo = new Nodo("                 81");
        raiz.derecho.derecho.derecho = new Nodo("                 93");

        // Nivel 4
        raiz.izquierdo.izquierdo.izquierdo.izquierdo = new Nodo("                       3");
        raiz.izquierdo.izquierdo.izquierdo.derecho = new Nodo("                       9");

        raiz.derecho.derecho.derecho.izquierdo = new Nodo("                       90");
        raiz.derecho.derecho.derecho.derecho = new Nodo("                       99");

        // Nivel 5
        raiz.izquierdo.izquierdo.izquierdo.izquierdo.izquierdo =
                new Nodo("                               1");
        raiz.izquierdo.izquierdo.izquierdo.izquierdo.derecho =
                new Nodo("                               4");

        // MOSTRAR ÁRBOL
        System.out.println("ÁRBOL BINARIO (6 niveles):");
        imprimirArbol(raiz, 0);

        // RECORRIDOS
        System.out.println("\nPreorden:");
        preorden(raiz);

        System.out.println("\n\nInorden:");
        inorden(raiz);

        System.out.println("\n\nPostorden:");
        postorden(raiz);
    }
}
