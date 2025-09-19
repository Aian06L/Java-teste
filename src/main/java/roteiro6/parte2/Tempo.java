/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro6.parte2;

/**
 *
 * @author aian1
 */
public class Tempo {
    private int hora;
    private int minutos;
    private int segundos;
         
         public Tempo(int hora, int minutos, int segundos){
             this.hora= hora;
             this.minutos = minutos;
             this.segundos = segundos;
         }
    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * @return the segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
        public int totalSegundos() {
        return hora * 3600 + minutos * 60 + segundos;
    }

      public String toString() {
      return String.format("%02d", hora) + ":" + String.format("%02d", minutos) + ":" + String.format("%02d", segundos);
     }
}
