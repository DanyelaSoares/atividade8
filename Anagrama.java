/*Escreva um programa
que receba duas palavras e determine se elas são anagramas (se possuem
as mesmas letras, mas em ordem diferente). Exemplo: "amor" e "roma".
 */

 import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine().toLowerCase();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine().toLowerCase();

        if (saoAnagramas(palavra1, palavra2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }

        scanner.close();
    }

    public static boolean saoAnagramas(String palavra1, String palavra2) {
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        return Arrays.equals(letras1, letras2);
    }
}
