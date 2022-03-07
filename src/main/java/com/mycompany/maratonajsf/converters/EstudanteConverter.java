package com.mycompany.maratonajsf.converters;

import com.mycompany.maratonajsf.model.Estudante;
import java.util.List;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Home
 */
@FacesConverter(value = "estudanteConverter")
public class EstudanteConverter implements Converter {

    private List<Estudante> estudanteList = Estudante.estudantesList();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value == null || !value.matches("\\d+")) {
            return null;
        }
//        Estudante estudante = new Estudante();
//        estudante.setId(Integer.parseInt(value));
//        int index = estudanteList.indexOf(estudante);
//        return estudanteList.get(index);
        Object o = this.getAttributesFrom(uic).get(value);
        System.out.println(o);
        return this.getAttributesFrom(uic).get(value);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
        if (value != null && !value.equals("")) {
            Estudante estudante = (Estudante) value;
            if (estudante.getId() != null) {
                this.addAttribute(uic, estudante);
                return estudante.getId().toString();
            }
        }
        return null;
    }

    private Map<String, Object> getAttributesFrom(UIComponent component) {
        return component.getAttributes();
    }

    private void addAttribute(UIComponent component, Estudante estudante) {
        this.getAttributesFrom(component).put(estudante.getId().toString(), estudante);
    }

}
