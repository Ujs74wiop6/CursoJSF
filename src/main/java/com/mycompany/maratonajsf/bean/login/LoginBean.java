package com.mycompany.maratonajsf.bean.login;

import com.mycompany.maratonajsf.model.Estudante;
import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Locale;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@SessionScoped
public class LoginBean implements Serializable {

    private String nome;
    private String senha;
    private Estudante estudante;
    private List<Locale> localeList = asList(new Locale("en"), new Locale("pt"));
    private String language;
    private int qtdeMensagens;

    public String logar() {
        //Faz uma busca no banco
        if (nome.equals("w") && senha.equals("1")) {
            estudante = new Estudante();
            qtdeMensagens++;
            return "/restricted/iniciosistema.xhtml?faces-redirect=true";
        }
        FacesContext contex = FacesContext.getCurrentInstance();
        contex.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário e/ou senha invalido", ""));
        return null;
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        estudante = null;
        return "/login?faces-redirect=true";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Locale> getLocaleList() {
        return localeList;
    }

    public void setLocaleList(List<Locale> localeList) {
        this.localeList = localeList;
    }

    public int getQtdeMensagens() {
        return qtdeMensagens;
    }

    public void setQtdeMensagens(int qtdeMensagens) {
        this.qtdeMensagens = qtdeMensagens;
    }
}
