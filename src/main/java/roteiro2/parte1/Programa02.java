/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte1;

import java.util.Scanner;

public class Programa02 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um numero");
        String numero = entrada.nextLine();
        
        System.out.println("Numero Informado :" + numero);
        
        entrada.close();
    }
}
