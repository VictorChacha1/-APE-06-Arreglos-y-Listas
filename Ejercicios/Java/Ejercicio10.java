import java.util.LinkedList;
public class Ejercicio10 {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        fila.add("Victor"); fila.add("Maria"); fila.add("Jose");
        while(!fila.isEmpty()) {
            System.out.println("Despachando a: " + fila.removeFirst());
        }
        System.out.println("No hay mas clientes en fila.");
    }
}
