/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte3;


public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
       Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso){
         matricula = pMatricula;
         nome = pNome;
         curso = pCurso;
         anoIngresso = pAnoIngresso;         
}

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
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
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the anoIngresso
     */
    public int getAnoIngresso() {
        return anoIngresso;
    }

    /**
     * @param anoIngresso the anoIngresso to set
     */
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}

