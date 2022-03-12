package com.mycompany.maratonajsf.bean.ajax;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Home
 */
@Named
@ViewScoped
public class AjaxTesteBean implements Serializable {

    private String nome;
    private String sobrenome;
    private String email;
    private Map<String, List<String>> animesPersonagensMap;
    private List<String> personagem;
    private String animeSelecionado;
    private String personagemSelecionado;

    {
        animesPersonagensMap = new TreeMap<>();
        animesPersonagensMap.put("Hellsing", Arrays.asList("Alucard", "Seras", "Akexander"));
        animesPersonagensMap.put("Attack on Titan", Arrays.asList("Eren", "Mikasa", "Armin"));
        animesPersonagensMap.put("Berserk", Arrays.asList("Guts", "Casca", "Griffith"));
        animesPersonagensMap.put("Naruto", Arrays.asList("Minato", "Sasuke", "Itachi", "Boruto"));
    }

    public void toUpperCase(AjaxBehaviorEvent event) {
        this.nome = this.nome.toUpperCase();
        this.sobrenome = this.sobrenome.toUpperCase();
        System.out.println(nome);
        System.out.println(sobrenome);
    }

    public void toUpperCaseNome() {
        this.nome = this.nome.toUpperCase();
        System.out.println(nome);
    }

    public void onSelectAnime() {
        if (animeSelecionado == null) {
            personagem = null;
            return;
        }
        personagem = animesPersonagensMap.get(animeSelecionado);
    }

    public Map<String, List<String>> getAnimesPersonagensMap() {
        return animesPersonagensMap;
    }

    public void setAnimesPersonagensMap(Map<String, List<String>> animesPersonagensMap) {
        this.animesPersonagensMap = animesPersonagensMap;
    }

    public List<String> getPersonagem() {
        return personagem;
    }

    public void setPersonagem(List<String> personagem) {
        this.personagem = personagem;
    }

    public String getAnimeSelecionado() {
        return animeSelecionado;
    }

    public void setAnimeSelecionado(String animeSelecionado) {
        this.animeSelecionado = animeSelecionado;
    }

    public String getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(String personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
