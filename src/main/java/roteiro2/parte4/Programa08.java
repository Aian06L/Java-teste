/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte4;

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args){
  
        Scanner entrada = new Scanner(System.in);
        
        int[] vetorNotas = new int[5];
        
        for (int cont = 0; cont < 5; cont++){
            System.out.println("Informe uma nota");
            int nota = entrada.nextInt();
            
            vetorNotas [cont] =  nota;
        }
        System.out.println("Valores armazenados");
        for (int cont=0; cont < 5; cont++){
          System.out.println("vetorNotas ["+ cont +"] = " + vetorNotas[cont]);    
        }      
         System.out.println("Valores armazenados variante 2");
          for (int cont = 0; cont < vetorNotas.length; cont++){
          System.out.println("vetorNotas[+ cont +]= "+ vetorNotas[cont]);
          }      
        System.out.println("Valores armazenados variante 3");
         for (int vetorNota : vetorNotas){
           System.out.println(vetorNota);
        }
    }
}
