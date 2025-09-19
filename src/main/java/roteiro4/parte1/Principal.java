/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte1;

import java.util.Scanner;

public class Principal {
   
    public static void main(String[] args){
        
        Aluno aluno01 = new Aluno();
        aluno01.matricula = 111;
        aluno01.nome = "Jose";
        aluno01.curso = "Sistema de Informação";
        aluno01.anoIngresso = 2019;
        
        Aluno aluno02 = new Aluno();
        aluno02.matricula = 222;
        aluno02.nome = "Ze";
        
        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano de Ingresso : " + aluno01.anoIngresso);
        
        System.out.println("Nome : " + aluno02.nome);
        System.out.println ("Matricula :" + aluno02.matricula);
    }
}
         
 