import java.util.ArrayList;
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("Victor");
        estudiantes.add("Maria");
        estudiantes.add("Luis");
        estudiantes.add("Ana");
        estudiantes.add("Pedro");
        for(int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Estudiante " + (i+1) + ": " + estudiantes.get(i));
        }
    }
}
