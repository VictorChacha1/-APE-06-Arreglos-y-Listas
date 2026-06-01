import java.util.ArrayList;
public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(9.5); notas.add(8.0); notas.add(7.5);
        notas.add(10.0); notas.add(6.0); notas.add(8.5);
        double suma = 0;
        for(Double n : notas) suma += n;
        System.out.println("Promedio total: " + (suma / notas.size()));
    }
}
