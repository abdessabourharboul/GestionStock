package bean;

import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class Entree {

    private int id;
    private Article article = new Article();
    private Long quantite;
    private Long prixVente;
    private String dateEntree;
    private String Employe;

    public Entree() {
    }

    public Entree(int id) {
        this.id = id;
    }

    public Entree(int id, Long quantite, Long prixVente, String dateEntree, String Employe) {
        this.id = id;
        this.quantite = quantite;
        this.prixVente = prixVente;
        this.dateEntree = dateEntree;
        this.Employe = Employe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public Long getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(Long prixVente) {
        this.prixVente = prixVente;
    }

    public String getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(String dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getEmploye() {
        return Employe;
    }

    public void setEmploye(String Employe) {
        this.Employe = Employe;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entree other = (Entree) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entree{" + "id=" + id + ", article=" + article + ", quantite=" + quantite + ", prixVente=" + prixVente + ", dateEntree=" + dateEntree + ", Employe=" + Employe + '}';
    }

}
