/* Crie um programa que leia um número inteiro e exiba o número invertido. Exemplo: se o usuário digitar 1234, o programa deve exibir 4321.
*/

import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("Número invertido: " + invertido);

        scanner.close();
    }
}
