/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte2;

import java.util.Scanner;

public class Programa14 {
   
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        double x = entrada.nextDouble();

        System.out.println("Informe a operação (+, -, *, /): ");
        String operacao = entrada.next();

        System.out.println("Informe o valor de y: ");
        double y = entrada.nextDouble();

        switch (operacao) {
            case "+":
                System.out.println("Resultado: " + Programa14.soma(x, y));
                break;
            case "-":
                System.out.println("Resultado: " + Programa14.subtracao(x, y));
                break;
            case "*":
                System.out.println("Resultado: " + Programa14.multiplicacao(x, y));
                break;
            case "/":
                System.out.println("Resultado: " + Programa14.divisao(x, y));
                break;
            default:
                System.out.println("Operação invalida!");
                break;
        }

        entrada.close();
    }

    public static double soma(double x, double y) {
        return (x + y);
    }

    public static double subtracao(double x, double y) {
        return (x - y);
    }

    public static double multiplicacao(double x, double y) {
        return (x * y);
    }

    public static double divisao(double x, double y) {
        return (x / y);
    }
}