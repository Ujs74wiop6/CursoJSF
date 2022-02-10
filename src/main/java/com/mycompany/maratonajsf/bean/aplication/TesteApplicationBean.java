package com.mycompany.maratonajsf.bean.aplication;

import java.io.Serializable;
import java.util.Arrays;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author Home
 */
@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {

    private List<String> categoriaList;

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ApplicationScoped ");
        categoriaList = Arrays.asList("RPG", "SCI-FI", "TERROR");
    }

    public void mudarLista(){
        categoriaList = Arrays.asList("RPG", "SCI-FI", "TERROR", "Porn");
    }
    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }

}
