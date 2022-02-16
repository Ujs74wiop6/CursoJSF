package com.mycompany.maratonajsf.bean.estudante;

import com.mycompany.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Set;
import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"DevDojo", "eh", "foda", "demais"};
    private List<String> nomesList = Arrays.asList("Kakashi", "Jyraia", "Sasuke");
    private Set<String> nomesSet = new HashSet<>(Arrays.asList("Goku", "Luffy", "Naruto", "Kuririn"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;
    private boolean mostrarLink;

    {
        nomesMap.put("Goku", " o mais forte");
        nomesMap.put("One Pice", " o mais longo");
        nomesMap.put("Naruto", " o mais lenga lenga");

//        for (Map.Entry<String, String> entry : nomesMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }

    public void executar() {
        System.out.println("Fazendo um busca no BD");
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public void executar(String parm) {
        System.out.println("Fazendo um busca no BD com o PARAMETRO: " + parm);
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public String executarRetorno(String parm) {
        return "Quem é lindão? " + parm;
    }

    public String irPataIndex2() {
        System.out.println("entrou");
        return "index2?faces-redirect=true";
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public void exibirNotas() {
        this.mostrarNotas = true;
    }

    public void esconderNotas() {
        this.mostrarNotas = false;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    public void exibirLink() {
        this.mostrarLink = true;
    }

    public void esconderLink() {
        this.mostrarLink = false;
    }

    public void calcularCubo(LambdaExpression le, long value) {
        long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(),
                value);
        System.out.println(result);
    }

}
