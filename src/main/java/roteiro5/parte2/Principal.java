/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte2;


public class Principal {
    public static void main(String[] args){
        
        Loja loja01= new Loja("Lojão da Cidade","Lojão Comércio LTDA","11223344");     
        Loja loja02 = new Loja ("Mercadão do povo","", "10101010");
        Loja loja03 = new Loja ("Lojão da cidade", "Lojão Comércio LTDA", "11223344");
        // que apesar dos resutados da loja01 e 03 serem iguais eles conseguem operar e indentificar as lojas
        // Sim.
        loja01.setValorFat(1000);
        loja02.setValorFat(2000);
        loja03.setValorFat(1000);
        
        System.out.println(" ****** Teste 1 ******** ");
        if ( loja01.getNomeFantasia() == loja03.getNomeFantasia() ){
         System.out.println("Lojas Iguais");
         }
        else {
        System.out.println("Lojas Diferentes");
         }
        System.out.println(" ****** Teste 2 ********");
        if ( loja01.getNomeFantasia().equals(loja03.getNomeFantasia()) ){
        System.out.println("Lojas Iguais");
         }
        else {
        System.out.println("Lojas Diferentes");
        }
        System.out.println(" ****** Teste 3 ********");
        if (loja01 == loja03){
            System.out.println("Lojas Iguais");
            }
        else {
            System.out.println(" Lojas Diferentes");
        }
        System.out.println(" ****** Teste 4 ********");
        if (loja01.equals(loja03)){
            System.out.println("Lojas Iguais");
        }
        else {
            System.out.println("Lojas Diferentes");
        }
        System.out.println(" ****** Teste 5 ********");
        if (loja01.getValorFat() == loja03.getValorFat() ){
            System.out.println("Faturamentos Iguais");
        }
        else {
            System.out.println("Faturamentos Diferentes");
        }
    }
}