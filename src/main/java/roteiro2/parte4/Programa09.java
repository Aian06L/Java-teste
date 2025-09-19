/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte4;

import java.util.Scanner;

public class Programa09 {
  public static void main (String[] args){     
   
   Scanner entrada = new Scanner(System.in);
  
   int[] vetorNotas = new int[5];
   int posicao = 0;
   
     while(true) {
         System.out.println("Informe uma nota");
         int nota = entrada.nextInt();
         if(nota >= 0 && nota <= 10){
             vetorNotas[posicao] = nota;
             posicao++;
             if (posicao >= vetorNotas.length){
                 break;
             }
         }
         else {
             System.out.println("A nota precisa ser  um valor entre 0 e 10. Tente novamente!");
             
         }
     }
      System.out.println("Valores armazenados;");
      for(int cont = 0 ; cont < 5; cont++) {
          System.out.println("vetorNotas["+ cont+"] = vetorNotas[cont]");
          
      }
    }
  }   

