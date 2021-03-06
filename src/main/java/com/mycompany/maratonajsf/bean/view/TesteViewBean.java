package com.mycompany.maratonajsf.bean.view;

import com.mycompany.maratonajsf.bean.dependent.TesteDependentBean;
import com.mycompany.maratonajsf.bean.session.TesteSessionBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@ViewScoped
public class TesteViewBean implements Serializable {

    private List<String> personagens;
    private List<String> personagensSelecionado = new ArrayList<>();
    private final TesteDependentBean dependentBean;
    private final TesteSessionBean sessionBean;

    @Inject
    public TesteViewBean(TesteDependentBean dependentBean,
            TesteSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ViewScoped ");
        personagens = Arrays.asList("Naruto", "Hinata", "Yondaime");
    }

    public void selecionarPersonagem() {
        System.out.println(sessionBean.getEstudante().getNome());
        if (sessionBean.getEstudante().getNome().equals("Fabricio")) {
            int index = ThreadLocalRandom.current().nextInt(3);
            String personagem = personagens.get(index);
            personagensSelecionado.add(personagem);
            dependentBean.getPersonagensSelecionado().add(personagem);
        }
    }

    public TesteSessionBean getSessionBean() {
        return sessionBean;
    }

    public TesteDependentBean getDependentBean() {
        return dependentBean;
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
