import java.util.ArrayList;
public class Ejercicio7 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1; arr[1] = 2; arr[2] = 3;
        System.out.println("Arreglo fijo length: " + arr.length);
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1); lista.add(2);
        System.out.println("ArrayList dinamico size: " + lista.size());
    }
}
