package com.mycompany.maratonajsf.bean.viewexpired;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@ViewScoped
public class ViewExpiredTesteBean implements Serializable {

    private String nome;

    public void save() {
        System.out.println("nome ->" + nome);
    }

    public String invalidateSassion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/login?faces-redirect=true";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
