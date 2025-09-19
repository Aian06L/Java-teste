/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte2;

import java.util.Scanner;

public class Programa13 {
    public static void main(String[] args){
        
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Informe o vslor de X");
        double X = entrada.nextDouble();
        System.out.println("Informe a operação (x, -, *, /) ");
        String op = entrada.next();
        System.out.println("Informe o valor de Y");
        double Y = entrada.nextDouble();
        
        switch(op){
            case "+" : soma (X, Y);
             break;
            case "-" : subtracao (X, Y);
             break;
            case "*" : multiplicacao (X, Y);
             break;
            case "/" : divisao (X, Y);
            default :
                System.out.println("Operação Invalida");
        }
    }
    public static void soma (double X, double Y) {
        System.out.println("Resultado : " + (X + Y) );
    }
    public static void subtracao (double X, double Y) {
        System.out.println("Resultado : " + (X - Y));
        }
    public static void multiplicacao (double X , double Y) {
        System.out.println("Resulado : " + (X * Y) );
    }
    public static void divisao (double X, double Y){
        System.out.println("Resultado : " + (X / Y));
    }
}
