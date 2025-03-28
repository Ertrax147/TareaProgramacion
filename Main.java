
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int cantidadNotas = 20; // Número de notas a generar

        // Generar notas aleatorias
        List<Double> notas = NotasGenerador.generarNotas(cantidadNotas);

        // Mostrar las notas generadas
        System.out.println("Notas Generadas:");
        notas.forEach(nota -> System.out.printf("%.2f ", nota));
        System.out.println();

        // Procesar y mostrar resultados
        NotasProcesador.procesarImperativo(notas);
        NotasProcesador.procesarFuncional(notas);
    }
}
