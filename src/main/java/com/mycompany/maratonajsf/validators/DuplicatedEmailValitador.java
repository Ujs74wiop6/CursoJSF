package com.mycompany.maratonajsf.validators;

import com.mycompany.maratonajsf.bean.login.LoginBean;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import java.util.List;
import static java.util.Arrays.asList;
import javax.inject.Inject;

/**
 *
 * @author Home
 */
@FacesValidator
public class DuplicatedEmailValitador implements Validator {

    private List<String> emailDB = asList("fabricio.tiago@gmail.com.br", "contato@devdojo.coom.br");

    @Inject
    private LoginBean loginBean = new LoginBean();

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object t)
            throws ValidatorException {

        System.out.println(loginBean.getLanguage());
        String email = (String) t;
        if (emailDB.contains(email)) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "O email já existe",
                    "");
            throw new ValidatorException(message);
        }
    }

}
