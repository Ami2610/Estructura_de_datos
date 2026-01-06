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

    public static void main(String[] args) {
        // Árbol vacío
        Nodo arbolVacio = null;

        // Nodo raíz
        Nodo raiz = new Nodo("R");

        // Subárbol izquierdo primer término
        raiz.izquierdo = new Nodo("      T1");

        // Subárbol derecho segundo término
        raiz.derecho = new Nodo("      T2");

        // Hijos del primer término
        raiz.izquierdo.izquierdo = new Nodo("            T1.1");
        raiz.izquierdo.derecho = new Nodo("            T1.2");

        // Hijos del segundo término
        raiz.derecho.izquierdo = new Nodo("            T2.1");
        raiz.derecho.derecho = new Nodo("            T2.2");

        // Hijos de T1.1 (nivel 3)
        raiz.izquierdo.izquierdo.izquierdo = new Nodo("                 T1.1.1");
        raiz.izquierdo.izquierdo.derecho = new Nodo("                 T1.1.2");

        // Hijos de T1.2 (nivel 3)
        raiz.izquierdo.derecho.izquierdo = new Nodo("                 T1.2.1");
        raiz.izquierdo.derecho.derecho = new Nodo("                 T1.2.2");

        // Hijos de T2.1 (nivel 3)
        raiz.derecho.izquierdo.izquierdo = new Nodo("                 T2.1.1");
        raiz.derecho.izquierdo.derecho = new Nodo("                 T2.1.2");

        // Hijos de T2.2 (nivel 3)
        raiz.derecho.derecho.izquierdo = new Nodo("                 T2.2.1");
        raiz.derecho.derecho.derecho = new Nodo("                 T2.2.2");

        // Añadiendo un nuevo nivel (nivel 4)
        // Hijos de T1.1.1 (nivel 4)
        raiz.izquierdo.izquierdo.izquierdo.izquierdo = new Nodo("                       T1.1.1.1");
        raiz.izquierdo.izquierdo.izquierdo.derecho = new Nodo("                       T1.1.1.2");

        // Hijos de T1.1.2 (nivel 4)
        raiz.izquierdo.izquierdo.derecho.izquierdo = new Nodo("                       T1.1.2.1");
        raiz.izquierdo.izquierdo.derecho.derecho = new Nodo("                       T1.1.2.2");

        // Hijos de T1.2.1 (nivel 4)
        raiz.izquierdo.derecho.izquierdo.izquierdo = new Nodo("                       T1.2.1.1");
        raiz.izquierdo.derecho.izquierdo.derecho = new Nodo("                       T1.2.1.2");

        // Hijos de T1.2.2 (nivel 4)
        raiz.izquierdo.derecho.derecho.izquierdo = new Nodo("                       T1.2.2.1");
        raiz.izquierdo.derecho.derecho.derecho = new Nodo("                       T1.2.2.2");

        // Hijos de T2.1.1 (nivel 4)
        raiz.derecho.izquierdo.izquierdo.izquierdo = new Nodo("                       T2.1.1.1");
        raiz.derecho.izquierdo.izquierdo.derecho = new Nodo("                       T2.1.1.2");

        // Hijos de T2.1.2 (nivel 4)
        raiz.derecho.izquierdo.derecho.izquierdo = new Nodo("                       T2.1.2.1");
        raiz.derecho.izquierdo.derecho.derecho = new Nodo("                       T2.1.2.2");

        // Hijos de T2.2.1 (nivel 4)
        raiz.derecho.derecho.izquierdo.izquierdo = new Nodo("                       T2.2.1.1");
        raiz.derecho.derecho.izquierdo.derecho = new Nodo("                       T2.2.1.2");

        // Hijos de T2.2.2 (nivel 4)
        raiz.derecho.derecho.derecho.izquierdo = new Nodo("                       T2.2.2.1");
        raiz.derecho.derecho.derecho.derecho = new Nodo("                       T2.2.2.2");

        // Añadiendo un nuevo nivel (nivel 4)
        // Hijos de T1.1.1 (nivel 4)
        raiz.izquierdo.izquierdo.izquierdo.izquierdo.izquierdo = new Nodo("                               T1.1.1.1.1");
        raiz.izquierdo.izquierdo.izquierdo.izquierdo.derecho = new Nodo("                               T1.1.1.1.2");

        raiz.izquierdo.izquierdo.izquierdo.derecho.izquierdo = new Nodo("                               T1.1.1.2.1");
        raiz.izquierdo.izquierdo.izquierdo.derecho.derecho = new Nodo("                               T1.1.1.2.2");

        // Hijos de T1.1.1 (nivel 4)
        raiz.izquierdo.izquierdo.derecho.izquierdo.izquierdo = new Nodo("                               T1.1.2.1.1");
        raiz.izquierdo.izquierdo.derecho.izquierdo.derecho = new Nodo("                               T1.1.2.1.2");

        raiz.izquierdo.izquierdo.derecho.derecho.izquierdo = new Nodo("                               T1.1.2.2.1");
        raiz.izquierdo.izquierdo.derecho.derecho.derecho = new Nodo("                               T1.1.2.2.2");

        // Hijos de T1.1.1 (nivel 4)
        raiz.izquierdo.izquierdo.izquierdo.izquierdo.izquierdo = new Nodo("                               T1.1.1.1.1");
        raiz.izquierdo.izquierdo.izquierdo.izquierdo.derecho = new Nodo("                               T1.1.1.1.2");

        raiz.izquierdo.izquierdo.izquierdo.derecho.izquierdo = new Nodo("                               T1.1.1.2.1");
        raiz.izquierdo.izquierdo.izquierdo.derecho.derecho = new Nodo("                               T1.1.1.2.2");

        // Hijos de T1.1.1 (nivel 4)
        raiz.izquierdo.izquierdo.derecho.izquierdo.izquierdo = new Nodo("                               T1.1.2.1.1");
        raiz.izquierdo.izquierdo.derecho.izquierdo.derecho = new Nodo("                               T1.1.2.1.2");

        raiz.izquierdo.izquierdo.derecho.derecho.izquierdo = new Nodo("                               T1.1.2.2.1");
        raiz.izquierdo.izquierdo.derecho.derecho.derecho = new Nodo("                               T1.1.2.2.2");

        // Hijos de T1.1.1 (nivel 4)
        raiz.derecho.derecho.izquierdo.izquierdo.izquierdo = new Nodo("                               T1.1.1.1.1");
        raiz.derecho.derecho.izquierdo.izquierdo.derecho = new Nodo("                               T1.1.1.1.2");

        raiz.derecho.derecho.izquierdo.derecho.izquierdo = new Nodo("                               T1.1.1.2.1");
        raiz.derecho.derecho.izquierdo.derecho.derecho = new Nodo("                               T1.1.1.2.2");

        // Hijos de T1.1.1 (nivel 4)
        raiz.derecho.izquierdo.derecho.izquierdo.izquierdo = new Nodo("                               T1.1.2.1.1");
        raiz.derecho.izquierdo.derecho.izquierdo.derecho = new Nodo("                               T1.1.2.1.2");

        raiz.derecho.izquierdo.derecho.derecho.izquierdo = new Nodo("                               T1.1.2.2.1");
        raiz.derecho.izquierdo.derecho.derecho.derecho = new Nodo("                               T1.1.2.2.2");

        // Hijos de T1.1.1 (nivel 4)
        raiz.derecho.izquierdo.izquierdo.izquierdo.izquierdo = new Nodo("                               T1.1.1.1.1");
        raiz.derecho.izquierdo.izquierdo.izquierdo.derecho = new Nodo("                               T1.1.1.1.2");

        raiz.derecho.izquierdo.izquierdo.derecho.izquierdo = new Nodo("                               T1.1.1.2.1");
        raiz.derecho.izquierdo.izquierdo.derecho.derecho = new Nodo("                               T1.1.1.2.2");

        // Hijos de T1.1.1 (nivel 4)
        raiz.derecho.izquierdo.derecho.izquierdo.izquierdo = new Nodo("                               T1.1.2.1.1");
        raiz.derecho.izquierdo.derecho.izquierdo.derecho = new Nodo("                               T1.1.2.1.2");

        raiz.derecho.izquierdo.derecho.derecho.izquierdo = new Nodo("                               T1.1.2.2.1");
        raiz.derecho.izquierdo.derecho.derecho.derecho = new Nodo("                               T1.1.2.2.2");
        imprimirArbol(raiz, 0);
    }
}
