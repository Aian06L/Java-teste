/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro6.parte1;
import java.util.Scanner;
/**
 *
 * @author aian1
 */
public class Ligacao {
    
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private String horaInicio;
    private String horaFim;
    
        
        public Ligacao(String numOrigem, String numDestino, String localOrigem,String 
        localDestino,String horaInicio){
            this.numOrigem = numOrigem;
            this.numDestino = numDestino;
            this.localOrigem = localOrigem;
            this.localDestino = localDestino;
            this.horaInicio = horaInicio;
            this.horaFim = "";
        }
        public String getDuracao() {
         String[] strInicio = horaInicio.split(":");
         String[] strFim =  horaInicio.split(":");
         
         int inicio = Integer.parseInt(strInicio[0]) * 3600 + Integer.parseInt(strInicio[1]) * 60 + Integer.parseInt(strInicio[2]);
         int fim = Integer.parseInt(strFim[0]) * 3600 + Integer.parseInt(strFim[1]) * 60 + Integer.parseInt(strFim[2]);

         int segundos = fim - inicio;
         
         int horas = segundos * 3600;
         int minutos = (segundos % 3600) / 60;
         int segundosRestantes = segundos % 60;
         
         return String.format("%02d", horas) + ":" + String.format("%02d", minutos) + ":" + String.format("%02d", segundosRestantes);
     }         
      
    /**
     * @return the numOrigem
     */
    public String getNumOrigem() {
        return numOrigem;
    }

    /**
     * @param numOrigem the numOrigem to set
     */
    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }

    /**
     * @return the numDestino
     */
    public String getNumDestino() {
        return numDestino;
    }

    /**
     * @param numDestino the numDestino to set
     */
    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    /**
     * @return the localOrigem
     */
    public String getLocalOrigem() {
        return localOrigem;
    }

    /**
     * @param localOrigem the localOrigem to set
     */
    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    /**
     * @return the localDestino
     */
    public String getLocalDestino() {
        return localDestino;
    }

    /**
     * @param localDestino the localDestino to set
     */
    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    /**
     * @return the horaInicio
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFim
     */
    public String getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
}