package com.mycompany.maratonajsf.validators;

import com.mycompany.maratonajsf.bean.login.LoginBean;
import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@RequestScoped
public class Validators implements Serializable {

    private List<String> emailDB = asList("fabricio.tiago@gmail.com.br", "contato@devdojo.coom.br");
    @Inject
    private LoginBean loginBean;

    public void validateDuplicatedEmail(FacesContext fc, UIComponent uic, Object t)
            throws ValidatorException {
//        System.out.println(loginBean.getLanguage());
        String email = (String) t;
        if (emailDB.contains(email)) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "O email já existe",
                    "");
            throw new ValidatorException(message);
        }
    }
}
