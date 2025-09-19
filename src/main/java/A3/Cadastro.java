/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A3;
 import java.util.Scanner;
import java.util.ArrayList;
public class Cadastro {
    Scanner entrada = new Scanner(System.in);
    
         System.out.println("CADASTRO :");
              System.out.println("Informe o nome ");
              String nome = entrada.nextLine();
            
              System.out.println("Informe o diretor, caso nao saiba digite o nome do filme ");
              String diretor = entrada.nextLine();
              
              System.out.println("Informe o tempo de duracao, caso nao saiba digite o nome do filme ");
              String tempduracao = entrada.nextLine();
              
              System.out.println("Informe a data de lancamento, caso nao saiba digite o nome do filme ");
              String data_lancamento = entrada.nextLine();
              
              System.out.println("Informe o genero, caso nao saiba digite o nome do filme ");
              String genero = entrada.nextLine();
              
              Filme novofilme = new Filme(nome,diretor,tempduracao,data_lancamento,genero );
              //Os inputs serão armazenadas como atributos do objeto novofilme
              listafilme.add(novofilme);
              /*O objeto novofilme será armazenado no ArrayList em uma nova posição cada vez que o usuário 
              entrar na funcionalidade de cadastro do switch. Assim,cada novo obejeto cadastrado será quardado
              em uma posição diferete dentro do listafilme*/
              
                }

