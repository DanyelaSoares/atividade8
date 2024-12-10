/*Crie um
jogo em que o programa escolhe um número entre 1 e 50, e o/a usuário/a
deve adivinhar. O programa informa apenas se o palpite está certo ou
errado. O jogo termina quando o número é adivinhado. */

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.trim().split("\\s+");
        int numeroDePalavras = palavras.length;

        System.out.println("O número de palavras na frase é: " + numeroDePalavras);

        scanner.close();
    }
}
