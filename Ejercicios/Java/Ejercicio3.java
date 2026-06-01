import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> prods = new ArrayList<>();

        prods.add("Teclado");
        prods.add("Mouse");
        prods.add("Monitor");

        Scanner sc = new Scanner(System.in);

        System.out.print("Buscar producto: ");
        String buscar = sc.next();

        if (prods.contains(buscar)) {
            System.out.println("Producto encontrado");
        } else {
            System.out.println("No existe");
        }

        sc.close(); 
    }
}
