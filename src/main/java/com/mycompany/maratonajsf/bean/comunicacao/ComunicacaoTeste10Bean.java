package com.mycompany.maratonajsf.bean.comunicacao;

import com.mycompany.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@ViewScoped
public class ComunicacaoTeste10Bean implements Serializable {

    private String password;
    private List<Estudante> estudanteList = Estudante.estudantesList();

    public void remover(Estudante estudante) {
        estudanteList.remove(estudante);
    }

    public void salvar() {
        System.out.println(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
}
