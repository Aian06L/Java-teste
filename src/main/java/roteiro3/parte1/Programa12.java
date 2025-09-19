/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3.parte1;

import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args){
     Scanner entrada = new Scanner(System.in);
     
     double sb, grat, imp, sr;
        
     System.out.println("Informe o Salario base");
     sb = entrada.nextDouble();
     
     Resultados resultados = calcular(sb);
     
     grat = resultados.grat;
     imp = resultados.imp;
     sr = sb + grat - imp;
     
     System.out.println("Salario a receber = " + sr);
    }
    
   public static Resultados calcular(double sb) {
        double grat = sb * 5 / 100;
        double imp = sb * 7 / 100;
        return new Resultados(grat, imp);
    }
    
    public static class Resultados {
        double grat;
        double imp;
        
        public Resultados(double grat, double imp) {
            this.grat = grat;
            this.imp = imp;
        } 
    }
 }
