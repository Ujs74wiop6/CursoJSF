package com.mycompany.maratonajsf.bean.comunicacao;

import com.mycompany.maratonajsf.model.Estudante;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@ViewScoped
public class ComunicacaoTeste5Bean implements Serializable {

    private String nome;
    private String sobrenome;
    private Estudante estudante = new Estudante();
    private Estudante estudante2;

    public void execute() {
        System.out.println("Dentro do execute " + nome);
        System.out.println("Dentro do execute " + sobrenome);
        System.out.println("Dentro do execute " + estudante2.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("veio do setPropertyActionListener" + nome);
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        System.out.println("veio do setPropertyActionListener" + sobrenome);
        this.sobrenome = sobrenome;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Estudante getEstudante2() {
        return estudante2;
    }

    public void setEstudante2(Estudante estudante2) {
        this.estudante2 = estudante2;
    }

}
