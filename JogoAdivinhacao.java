/*Crie um
jogo em que o programa escolhe um número entre 1 e 50, e o/a usuário/a
deve adivinhar. O programa informa apenas se o palpite está certo ou
errado. O jogo termina quando o número é adivinhado. */

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroEscolhido = random.nextInt(50) + 1;
        int palpite;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 50).");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou o número.");
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        } while (palpite != numeroEscolhido);

        scanner.close();
    }
}
