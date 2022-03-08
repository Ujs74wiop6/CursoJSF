package com.mycompany.maratonajsf.bean.datatable;

import com.mycompany.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@ViewScoped
public class DataTableTesteBean implements Serializable {

    private List<Estudante> estudanteList = Estudante.estudantesList();
    private Set<Estudante> estudanteSet = new HashSet<>(Estudante.estudantesList());
    private List<Estudante> estudantesLinkedList = new LinkedList<>(Estudante.estudantesList());

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public Set<Estudante> getEstudanteSet() {
        return estudanteSet;
    }

    public void setEstudanteSet(Set<Estudante> estudanteSet) {
        this.estudanteSet = estudanteSet;
    }

    public List<Estudante> getEstudantesLinkedList() {
        return estudantesLinkedList;
    }

    public void setEstudantesLinkedList(List<Estudante> estudantesLinkedList) {
        this.estudantesLinkedList = estudantesLinkedList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
}
