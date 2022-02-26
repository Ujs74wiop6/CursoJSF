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
public class ComunicacaoTeste11Bean implements Serializable {

    private List<Estudante> estudanteList = Estudante.estudantesList();

    public String editar(Estudante estudante) {
        ApplicationMapUtil.setValueInApplicationMap("estudante", estudante);
        return "comunicacao12?faces-redirect=true";
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }

}
