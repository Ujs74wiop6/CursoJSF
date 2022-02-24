package com.mycompany.maratonajsf.bean.comunicacao;

import com.mycompany.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.omnifaces.util.Faces;

/**
 *
 * @author Home
 */
@Named
@ViewScoped
public class ComunicacaoTeste8Bean implements Serializable {

    private String key;
    private String value;

    public void init() {
        Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
        System.out.println(requestCookieMap);
    }

    public void salvarCookie() {
        Faces.addResponseCookie(key, value, 0);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
