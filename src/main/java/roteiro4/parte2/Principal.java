/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte2;

public class Principal {
    
    public static void main(String[] args){
    
        Aluno aluno01 = new Aluno(111, "Jose", "SI", 2019);
        
        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Matricula : " + aluno01.anoIngresso);
    }
}
