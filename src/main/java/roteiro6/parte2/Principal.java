/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro6.parte2;
import java.util.Scanner;
/**
 *
 * @author aian1
 */
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", new Tempo(10, 15, 02));
        lig01.setHoraFim(new Tempo(10, 20, 57));

      System.out.println("Ligação de Origem :" + lig01.getNumOrigem());
        System.out.println("Ligação de Destino :" + lig01.getNumDestino());
        System.out.println("Local de Origem :" + lig01.getLocalOrigem());
        System.out.println("Local de Destino :" + lig01.getLocalDestino());
        
        System.out.println("Hora de Inicio : " + lig01.getHoraInicio());
        System.out.println("Hora do Fim : " + lig01.getHoraFim().toString());
        
        System.out.println("Duração da chamada : " + lig01.getDuracao());
     }       
  }
        

