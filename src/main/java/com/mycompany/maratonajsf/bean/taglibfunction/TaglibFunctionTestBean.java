package com.mycompany.maratonajsf.bean.taglibfunction;

import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import static java.util.Arrays.asList;

/**
 *
 * @author Home
 */
@Named
@ViewScoped
public class TaglibFunctionTestBean implements Serializable {

    private List<String> names = asList("fabricio tiago", "vitor silva", "gabriel costa");

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
