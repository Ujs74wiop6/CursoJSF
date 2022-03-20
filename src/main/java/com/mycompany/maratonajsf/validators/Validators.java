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
import javax.servlet.http.Part;

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

    public void validateFile(FacesContext fc, UIComponent uic, Object t)
            throws ValidatorException {
        Part file = (Part) t;
        try {
            validadeFileNameLength(file);
            validadeContentType(file);
            validadeFileSize(file);
        } catch (RuntimeException e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    e.getMessage(),
                    "");
            throw new ValidatorException(message);
        }
    }

    private void validadeFileNameLength(Part file) {
        if (file.getSubmittedFileName().length() > 10) {
            throw new RuntimeException("O nome + extensão não pode ser maior que 10");
        }
    }

    private void validadeContentType(Part file) {
        String contentType = file.getContentType();
        if (!contentType.equals("image/png") && !contentType.equals("image/jpge")) {
            throw new RuntimeException("Apenas imagens PHG e JPGE são permitidas");
        }
    }

    private void validadeFileSize(Part file) {
        if (file.getSize() > 1048576) {
            throw new RuntimeException("O arquivo não pode exeder 1Mb");
        }
    }
}
