/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte3;

import java.util.Scanner;

public class Loja {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    
         public Loja(String nomeFantasia, String razaoSocial, String cnpj){
             this.nomeFantasia = nomeFantasia;
             this.razaoSocial = razaoSocial;
             this.cnpj = cnpj;
         }         
         public Loja(String nomeFantasia, String cnpj){
             
             this(nomeFantasia, nomeFantasia , cnpj);
      }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the valorFat
     */
    public double getValorFat() {
        return valorFat;
    }

    /**
     * @param valorFat the valorFat to set
     */
    public void setValorFat(double valorFat) {
        this.valorFat = valorFat;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
    public static void compararFat_static(Loja lojaA, Loja lojaB ){

       if (lojaA.getValorFat() > lojaB.getValorFat()){
       System.out.println("Loja de Maior Fat : " + lojaA.nomeFantasia);
       }
       else {
       System.out.println("Loja de Maior Fat : " + lojaB.nomeFantasia);
       }
       }
       public void compararFat_naoStatic(Loja lojaB ){

       if (this.getValorFat() > lojaB.getValorFat()){
       System.out.println("Loja de Maior Fat : " + this.nomeFantasia);
       }
       else {
       System.out.println("Loja de Maior Fat : " + lojaB.nomeFantasia);
     }
    }

 }
 