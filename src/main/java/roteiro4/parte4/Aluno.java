/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4.parte4;

/**
 *
 * @author aian1
 */
public class Aluno {
    
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplinas;
    private String situacao;

    public Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso, int pQtdeDisciplinas) {
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
        this.setQtdeDisciplinas(pQtdeDisciplinas);
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

    /**
     * @return the qtdeDisciplinas
     */
    public int getQtdeDisciplinas() {
        return qtdeDisciplinas;
    }

    /**
     * @param qtdeDisciplinas the qtdeDisciplinas to set
     */
    public void setQtdeDisciplinas(int qtdeDisciplinas) {
        this.qtdeDisciplinas = qtdeDisciplinas;
        if (qtdeDisciplinas != 0) {
            this.situacao = "Matriculado";
        } else {
            this.situacao = "Não Matriculado";
        }
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }   
 }
