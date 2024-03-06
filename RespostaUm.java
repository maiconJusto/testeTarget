import java.util.ArrayList;
import java.util.List;

public class RespostaUm {
    public static void main(String[] args) {
        /*1) Observe o trecho de código abaixo: */
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("A soma é: " + soma);
        /*Ao final do processamento, qual será o valor da variável SOMA?
        Resultado da soma é 91 */
    }
}