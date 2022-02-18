package com.mycompany.maratonajsf.bean.session;

import com.mycompany.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@SessionScoped
public class TesteSessionBean implements Serializable {

    private List<String> personagens;
    private List<String> personagensSelecionado = new ArrayList<>();
    private Estudante estudante;

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do SessionScoped ");
        personagens = Arrays.asList("Goku", "Vegete", "Gohan");
        logar();
    }

    public void logar() {
        //Faz a consulta, verificou se está OK
        estudante = new Estudante();
    }

    public void selecionarPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagensSelecionado.add(personagem);
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }
    
    public List<String> getPersonagensSelecionado() {
        return personagensSelecionado;
    }

    public void setPersonagensSelecionado(List<String> personagensSelecionado) {
        this.personagensSelecionado = personagensSelecionado;
    }
}
