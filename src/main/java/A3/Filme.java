/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A3;

/**
 *
 * @author aian1
 */
public class Filme {
   private String nome;   
 private String genero;   
 private String tempo_duracao;   
 private String data_lancamento;   
 private String diretor;   
 //Todos os atributos dos Filmes serão String
     
    public Filme(String nome, String diretor, String tempo_duracao, String data_lancamento, String genero){
        this.nome = nome;
        this.diretor = diretor;
        this.tempo_duracao = tempo_duracao;
        this.data_lancamento = data_lancamento;
        this.genero = genero;
    }
    //gets e sets dos atributos do objeto Filme
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the tempo_duracao
     */
    public String getTempo_duracao() {
        return tempo_duracao;
    }

    /**
     * @param tempo_duracao the tempo_duracao to set
     */
    public void setTempo_duracao(String tempo_duracao) {
        this.tempo_duracao = tempo_duracao;
    }

    /**
     * @return the data_lancamento
     */
    public String getData_lancamento() {
        return data_lancamento;
    }

    /**
     * @param data_lancamento the data_lancamento to set
     */
    public void setData_lancamento(String data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    /**
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
 
}
