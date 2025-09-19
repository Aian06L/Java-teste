/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte4;

import java.util.Scanner;
import java.util.Random;

public class Exercicio {
  public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número secreto entre 1 e 100.");

        while (true) {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior do que o seu palpite.");
            } else {
                System.out.println("O número secreto é menor do que o seu palpite.");
            }
        }

        scanner.close();
    }    
}
