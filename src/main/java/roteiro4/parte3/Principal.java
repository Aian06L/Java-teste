/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte3;

/**
 *
 * @author aian1
 */
public class Principal {
   public static void main(String[] args) {
       
     Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);

     System.out.println("Matricula : " + aluno01.getMatricula());
     System.out.println("Nome : " + aluno01.getNome());
     System.out.println("Curso : " + aluno01.getCurso());
     System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());
     
     aluno01.setMatricula (222);

     Aluno aluno02 = new Aluno(333, "João", "Ads", 2024);
     
     System.out.println("Matricula : " + aluno02.getMatricula());
     System.out.println("Nome : " + aluno02.getNome());
     System.out.println("Curso : " + aluno02.getCurso());
     System.out.println("Ano de Ingresso : " + aluno02.getAnoIngresso());
     
     aluno02.setMatricula (111);
   } 
}
