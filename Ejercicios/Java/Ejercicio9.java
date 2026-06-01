import java.util.LinkedList;
public class Ejercicio9 {
    public static void main(String[] args) {
        LinkedList<String> turnos = new LinkedList<>();
        turnos.addLast("Turno A");
        turnos.addLast("Turno B");
        System.out.println("Atendiendo: " + turnos.removeFirst());
        System.out.println("Siguiente en espera: " + turnos.getFirst());
    }
}
