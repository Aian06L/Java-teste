/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte4;

import java.util.Scanner;

public class Principal {
      public static void main(String[] args) {

        Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");
        Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        loja01.setValorFat(10000);
        loja02.setValorFat(20000);
        loja03.setValorFat(10000);

        System.out.println(" ** Comparação com método estático ****");
        String lojaMaiorFatStatic = Loja.obterLojaMaiorFatStatic(loja01, loja02);
        System.out.println("Loja de Maior Fat : " + lojaMaiorFatStatic);

        System.out.println(" ** Comparação com método NÃO estático ****");
        String lojaMaiorFatNaoStatic = loja01.obterLojaMaiorFatNaoStatic(loja02);
        System.out.println("Loja de Maior Fat : " + lojaMaiorFatNaoStatic);

        System.out.println(" ** Comparação com método NÃO estático ****");
        lojaMaiorFatNaoStatic = loja02.obterLojaMaiorFatNaoStatic(loja01);
        System.out.println("Loja de Maior Fat : " + lojaMaiorFatNaoStatic);
    }
}
