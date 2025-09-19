/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro1.parte2;


public class Programa02 {
    public static void main(String[] args){
        int sb = 2500;
        int numHorasExtras=10;
        double hora = sb/160;
        double valorHoraExtra= hora*numHorasExtras;
        double valorTotal = sb+valorHoraExtra;
        
        System.out.println("Salario Base = " + valorTotal);
    }
}
