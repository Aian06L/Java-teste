/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro6.parte1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //Q.5 Sim é possivel utilizando a alteração com o set.
        //Q.6 Sim :
        Ligacao lig01 = new Ligacao("121212","565656","A", "B", "10:15:02");
        lig01.setHoraFim("10:20:03");
        
        System.out.println("Ligação de Origem :" + lig01.getNumOrigem());
        System.out.println("Ligação de Destino :" + lig01.getNumDestino());
        System.out.println("Local de Origem :" + lig01.getLocalOrigem());
        System.out.println("Local de Destino :" + lig01.getLocalDestino());
        
        System.out.println("Hora de Inicio : " + lig01.getHoraInicio());
        System.out.println("Hora do Fim : " + lig01.getHoraFim());
        
        System.out.println("Duração da chamada : " + lig01.getDuracao());
        }
    }
