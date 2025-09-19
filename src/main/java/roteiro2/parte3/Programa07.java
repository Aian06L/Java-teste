/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte3;

import java.util.Scanner;

public class Programa07 {
   public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       
   int cont = 0;
   int soma = 0;
   
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
    cont = cont + 1;
    soma = soma + nota;
    double media = (double) soma/cont;
    System.out.println("Media = " + media);
    /*Sim, é possível modificar o código para calcular e exibir 
    não,apenas a média, mas também quantas notas ficaram acima da média.Podemos armazenar as 
    notas em uma lista e, após o término da entrada de notas,calcular a média e contar 
    quantas notas estão acima dessa média.
    */
    }
   }    
}
