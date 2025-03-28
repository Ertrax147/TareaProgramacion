
import java.util.List;

public class NotasProcesador {

    // Enfoque Imperativo: Contar notas usando bucles
    public static void procesarImperativo(List<Double> notas) {
        int mayores4 = 0, menores36 = 0, rango36a40 = 0;

        for (double nota : notas) {
            if (nota > 4.0) mayores4++;
            else if (nota < 3.6) menores36++;
            else rango36a40++;
        }

        // Imprimir resultados
        System.out.println("\nResultados Imperativos:");
        System.out.println("Notas mayores a 4.0: " + mayores4);
        System.out.println("Notas menores a 3.6: " + menores36);
        System.out.println("Notas entre 3.6 y 4.0: " + rango36a40);
    }

    // Enfoque Funcional: Contar notas usando Streams
    public static void procesarFuncional(List<Double> notas) {
        long mayores4 = notas.stream().filter(n -> n > 4.0).count();
        long menores36 = notas.stream().filter(n -> n < 3.6).count();
        long rango36a40 = notas.stream().filter(n -> n >= 3.6 && n < 4.0).count();

        // Imprimir resultados
        System.out.println("\n Resultados Funcionales:");
        System.out.println("Notas mayores a 4.0: " + mayores4);
        System.out.println("Notas menores a 3.6: " + menores36);
        System.out.println("Notas entre 3.6 y 4.0: " + rango36a40);
    }
}
