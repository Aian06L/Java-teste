/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte3;

import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args){
        
        Scanner entrada =  new Scanner(System.in);
        
        while(true){
          System.out.println("Informe uma nota ou '-1' para sair");
           int nota = entrada.nextInt();
           if (nota == -1){
             break;  
           } 
           if (nota >=7){
            System.out.println("Aprovado");
           }
           else {
            System.out.println("Reprovado");
           }
        }      
    }
}
