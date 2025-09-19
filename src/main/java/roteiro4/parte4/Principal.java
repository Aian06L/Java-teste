/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte4;

import java.util.Scanner;

/**
 *
 * @author aian1
 */
public class Principal {
   
    //fazendo os cadrastos dos alunos
    private static int qtdeDisciplinas;
     public static void main(String[] args) {
         
      Scanner entrada = new Scanner(System.in);
      
      for(int i=0; i < 1; i++){
          System.out.println("Digite seu número da Matricula :");
          int matricula = Integer.parseInt (entrada.nextLine());
          
          System.out.println("Informe seu nome :");
          String nome = entrada.nextLine();
          
          System.out.println("Informe seu curso :");
          String curso = entrada.nextLine();
          
          System.out.println("Em qual ano você se ingressou ?:");
          int anoIngresso = Integer.parseInt (entrada.nextLine());
          
          System.out.println("Quantas Diciplinas você tem ?");
          int qtdeDiciplinas = Integer.parseInt(entrada.nextLine());      
      
          Aluno aluno01 = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplinas);
      
            System.out.println("Matricula: " + aluno01.getMatricula());
            System.out.println("Nome: " + aluno01.getNome());
            System.out.println("Curso: " + aluno01.getCurso());
            System.out.println("Ano de Ingresso: " + aluno01.getAnoIngresso());
            System.out.println("Quantidade de Disciplina: " + aluno01.getQtdeDisciplinas());
            System.out.println("Situação: " + aluno01.getSituacao());
            System.out.println();
      }
 }
          
}