import java.util.Random;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class NotasGenerador {
    
    // Método para generar una lista de notas aleatorias
    public static List<Double> generarNotas(int cantidad) {
        Random random = new Random();
        
        return DoubleStream.generate(() -> 1.0 + (random.nextDouble() * 6.0)) // Rango [1.0, 7.0]
                .limit(cantidad)
                .boxed()
                .collect(Collectors.toList());
    }
}
