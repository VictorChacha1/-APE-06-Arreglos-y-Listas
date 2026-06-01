import java.util.ArrayList;
class Prod {
    String nom; int cant; double pre;
    Prod(String n, int c, double p) { nom=n; cant=c; pre=p; }
}
public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Prod> inv = new ArrayList<>();
        inv.add(new Prod("Mouse", 10, 15.5));
        double total = 0;
        for(Prod p : inv) total += (p.cant * p.pre);
        System.out.println("Valor inventario: $" + total);
    }
}
