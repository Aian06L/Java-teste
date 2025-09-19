/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte3;

import java.util.Scanner;

public class Programa05 {
   public static void main(String[] args){
       
       Scanner entrada= new Scanner(System.in);
       
       for(int i=0;i<5;i++){
       System.out.println("Informe uma nota");
       int nota = entrada.nextInt();
       
       if (nota >=7){
         System.out.println("Aprovado"); 
       } 
       else {
           System.out.println("Reprovado");
       }
     }
   } 
}
