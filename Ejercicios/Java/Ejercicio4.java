import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.print("1.Add 2.Ver 3.Update 4.Delete 5.Salir: ");
            op = sc.nextInt();

            if (op == 1) {
                lista.add(sc.next());
            } else if (op == 2) {
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(i + ":" + lista.get(i));
                }
            } else if (op == 3) {
                int id = sc.nextInt();
                if (id < lista.size()) {
                    lista.set(id, sc.next());
                }
            } else if (op == 4) {
                int id = sc.nextInt();
                if (id < lista.size()) {
                    lista.remove(id);
                }
            }
        } while (op != 5);
        
        sc.close(); 
    }
}
