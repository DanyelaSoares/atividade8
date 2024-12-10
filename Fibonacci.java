/*Implemente um programa que calcule e exiba os primeiros n números da sequência de Fibonacci. n deve ser fornecido pelo/a usuário/a.
 */

 import java.util.Scanner;

 public class Fibonacci {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Digite a quantidade de números da sequência de Fibonacci a exibir: ");
         int n = scanner.nextInt();
 
         if (n <= 0) {
             System.out.println("Por favor, insira um número positivo.");
         } else {
             System.out.println("Sequência de Fibonacci:");
 
             long primeiro = 0, segundo = 1;
 
             for (int i = 1; i <= n; i++) {
                 System.out.print(primeiro + " ");
                 long proximo = primeiro + segundo;
                 primeiro = segundo;
                 segundo = proximo;
             }
         }
 
         scanner.close();
     }
 }
 