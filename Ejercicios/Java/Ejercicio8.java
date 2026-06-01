import java.util.ArrayList;
public class Ejercicio8 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10); lista.add(20); lista.add(30); // Funciona perfecto
        System.out.println("ArrayList crece, size: " + lista.size());
        try {
            arr[2] = 30; // Falla, index maximo es 1
        } catch(Exception e) {
            System.out.println("Error en arreglo: Limite superado");
        }
    }
}
