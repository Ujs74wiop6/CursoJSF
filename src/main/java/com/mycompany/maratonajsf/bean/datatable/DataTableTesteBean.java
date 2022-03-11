package com.mycompany.maratonajsf.bean.datatable;

import com.mycompany.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
    private Map<String, Object> mapEstudanteList = new HashMap<>();

    public void init() {
        mapEstudanteList.put("Estudane 1", new Estudante(1, "Ikki", "Fenix", 10));
        mapEstudanteList.put("Estudane 2", new Estudante(2, "Shiryu", "Dragao", 10));
        mapEstudanteList.put("Estudane 3", new Estudante(3, "Seiya", "Pegasus", 10));
        mapEstudanteList.values();
    }

    public void orderByNome(String ordem) {
        if (ordem.equals("asc")) {
            estudanteList.sort(Comparator.comparing(Estudante::getNome));
        } else {
            estudanteList.sort(Comparator.comparing(Estudante::getNome).reversed());
        }
    }

    public void orderBySobrenome(String ordem) {
        if (ordem.equals("asc")) {
            estudanteList.sort(Comparator.comparing(Estudante::getSobrenome));
        } else {
            estudanteList.sort(Comparator.comparing(Estudante::getSobrenome).reversed());
        }
    }

    public void remove(Estudante estudante) {
        //Faz uma chamada para o banco de dados
        estudanteList.remove(estudante);
    }

    public void edit(Estudante estudante) {
        estudante.setEditing(true);
    }

    public void save() {
        estudanteList.forEach(estudante -> {
            if (estudante.isEditing())
                System.out.println(estudante);
            estudante.setEditing(false);
            });
    }

    public Map<String, Object> getMapEstudanteList() {
        return mapEstudanteList;
    }

    public void setMapEstudanteList(Map<String, Object> mapEstudanteList) {
        this.mapEstudanteList = mapEstudanteList;
    }

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
