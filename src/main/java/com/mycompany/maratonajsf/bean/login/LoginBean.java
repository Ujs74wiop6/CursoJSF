package com.mycompany.maratonajsf.bean.login;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@SessionScoped
public class LoginBean implements Serializable {

    private String nome;
    private String senha;

    public String logar() {
        //Faz uma busca no banco
        if (nome.equals("w") && senha.equals("1")) {

        }
        return null;
    }
}
