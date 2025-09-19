/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5.parte1;
import java.util.Scanner;

public class Loja {
   private String nomeFantasia;
   private String razaoSocial;
   private String cnpj;
   private double valorFat;
   private double área;
   private String nomeProprietario;
   
     public Loja(String nomeFantasia,String razaoSocial, String cnpj){
         this.nomeFantasia = nomeFantasia;
         this.razaoSocial = razaoSocial;
         this.cnpj = cnpj;
         
         if(razaoSocial.equals("")){
             this.razaoSocial = nomeFantasia;
         }
         else {
             this.razaoSocial = razaoSocial;
         }
         this.cnpj = cnpj;
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
     * @return the área
     */
    public double getÁrea() {
        return área;
    }

    /**
     * @param área the área to set
     */
    public void setÁrea(double área) {
        this.área = área;
    }

    /**
     * @return the nomeProprietario
     */
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    /**
     * @param nomeProprietario the nomeProprietario to set
     */
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
         
}
