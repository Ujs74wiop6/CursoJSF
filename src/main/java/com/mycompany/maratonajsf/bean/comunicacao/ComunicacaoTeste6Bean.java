package com.mycompany.maratonajsf.bean.comunicacao;

import com.mycompany.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@ViewScoped
public class ComunicacaoTeste6Bean implements Serializable {

    private List<Estudante> estudantesList = Estudante.estudantesList();

    public String editar(int index) {
        Estudante estudante = estudantesList.get(index);
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("estudante", estudante);
        return "comunicacao7?faces-redirect=true";
    }

    public List<Estudante> getEstudantesList() {
        return estudantesList;
    }

    public void setEstudantesList(List<Estudante> estudantesList) {
        this.estudantesList = estudantesList;
    }
}
