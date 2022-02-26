package com.mycompany.maratonajsf.bean.comunicacao;

import com.mycompany.maratonajsf.model.Estudante;
import com.mycompany.maratonajsf.util.ApplicationMapUtil;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;
import org.omnifaces.util.Faces;

/**
 *
 * @author Home
 */
@Named
@RequestScoped
public class ComunicacaoTeste12Bean implements Serializable {

    private Estudante estudante;
    private Estudante estudante2 = new Estudante();

    public void init() {
        System.out.println("Entrou!!!");
        estudante = (Estudante) ApplicationMapUtil.getValueFromApplicationMap("estudante");
    }

    public String voltar() {
        System.out.println(estudante2.getNome());
        System.out.println(estudante2.getSobrenome());
        return "comunicacao11?faces-redirect=true";
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
