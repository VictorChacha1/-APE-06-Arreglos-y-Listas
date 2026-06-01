import java.util.ArrayList;
class Alumno {
    String nombre; double nota;
    Alumno(String n, double p) { nombre = n; nota = p; }
}
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Alumno> clase = new ArrayList<>();
        clase.add(new Alumno("Victor", 9.5));
        clase.add(new Alumno("Maria", 8.0));
        for(Alumno a : clase) System.out.println(a.nombre + " - " + a.nota);
    }
}
