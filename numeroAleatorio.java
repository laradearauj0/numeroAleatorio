import java.util.Random;
import java.util.Scanner;

public class estudos {
    public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
    int tentativas = 5;
    
    while (tentativas <= 5 && tentativas > 0){
        System.out.println("Você tem " + tentativas + " tentativas restantes. \nDigite um número entre 0 e 100:");
        int chute = inp.nextInt();
        if (chute > numeroAleatorio) {
            System.out.println("O número digitado é maior do que o número gerado.");
        } else if (chute < numeroAleatorio) {
            System.out.println("O número digitado é menor do que o número gerado.");
        } else {
            System.out.println("Parabéns! Você acertou o número!");
            break;    
        }
        tentativas--;
        if (tentativas == 0) {
            System.out.println("Suas tentativas acabaram. O número correto era: " + numeroAleatorio);
        }
    }
}
}
