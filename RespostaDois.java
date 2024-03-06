import java.util.ArrayList;
import java.util.List;

public class RespostaDois {
    public static void main(String[] args) {
        int num = 34; // substitua por qualquer número que você queira verificar
        List<Integer> fibonacciSequence = generateFibonacciSequence(num);
        if (fibonacciSequence.contains(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static List<Integer> generateFibonacciSequence(int max) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        int i = 1;
        while (true) {
            int next = sequence.get(i) + sequence.get(i - 1);
            if (next > max) {
                break;
            }
            sequence.add(next);
            i++;
        }
        return sequence;
    }
}