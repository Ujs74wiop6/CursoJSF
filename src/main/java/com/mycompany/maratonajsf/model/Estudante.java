package com.mycompany.maratonajsf.model;

import com.mycompany.maratonajsf.model.enums.Turno;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 *
 * @author Home
 */
public class Estudante implements Serializable {

    private String nome = "Fabricio";
    private String sobrenome = "Tiago Arantes";
    private double nota1 = 20;
    private double nota2;
    private double nota3 = 10;
    private Turno turno = Turno.MATUTINO;

    public Estudante() {

    }

    public Estudante(String nome, String sobrenome, double nota1) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota1 = nota1;
    }

    public static List<Estudante> estudantesList() {
        return new ArrayList<>(asList(new Estudante("Ikki", "Fenix", 10),
                new Estudante("Shiryu", "Dragao", 10),
                new Estudante("Seiya", "Pegasus", 10)));
    }

    public Estudante(double nota2) {
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

}
