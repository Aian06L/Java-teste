/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro2.parte2;

import javax.swing.JOptionPane;

public class Programa03 {
    public static void main(String[] args){
        
        System.out.println("Informe o seu nome");
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        JOptionPane.showMessageDialog(null, "Nome informado : " + nome); 
        
        String strIdade = JOptionPane.showInputDialog("Informe sua idade");
        int idade = Integer.parseInt(strIdade);
        JOptionPane.showMessageDialog(null, "Idade informada : " + idade);
        
        //Que foi utilizado a computação grafica nas duas variaveis de formas diferentes
        
    }
}
