/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro6.parte2;

/**
 *
 * @author aian1
 */
public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    
        
        public Ligacao(String numOrigem, String numDestino, String localOrigem,String 
        localDestino,Tempo horaInicio){
            this.numOrigem = numOrigem;
            this.numDestino = numDestino;
            this.localOrigem = localOrigem;
            this.localDestino = localDestino;
            this.horaInicio = horaInicio;
            this.horaFim = null;
        }
        public String getDuracao() {
        int inicio = horaInicio.totalSegundos();
        int fim = horaFim.totalSegundos();
         
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
    public Tempo getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(Tempo horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFim
     */
    public Tempo getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }
      
}
