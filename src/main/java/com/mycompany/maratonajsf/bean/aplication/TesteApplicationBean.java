package com.mycompany.maratonajsf.bean.aplication;

import com.mycompany.maratonajsf.bean.dependent.TesteDependentBean;
import com.mycompany.maratonajsf.bean.session.TesteSessionBean;
import java.io.Serializable;
import java.util.Arrays;
import static java.util.Arrays.asList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 *
 * @author Home
 */
@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {

    private List<String> categoriaList;
    private final TesteDependentBean dependentBean;
    private final TesteSessionBean sessionBean;

    @Inject
    public TesteApplicationBean(TesteDependentBean dependentBean,
            TesteSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ApplicationScoped ");
        categoriaList = Arrays.asList("RPG", "SCI-FI", "TERROR");
        dependentBean.getCategoriasList().addAll(asList("Comédia", "Romance"));
        sessionBean.selecionarPersonagem();
    }

    public TesteSessionBean getSessionBean() {
        return sessionBean;
    }

    public void mudarLista() {
        categoriaList = Arrays.asList("RPG", "SCI-FI", "TERROR", "Porn");
    }

    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
