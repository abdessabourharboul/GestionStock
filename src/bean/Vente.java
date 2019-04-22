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
public class Vente {

    private String id;
    private Article article = new Article();
    private Long quantite;
    private Date dateVente;
    private String Employe;

    public Vente() {
    }

    public Vente(String id) {
        this.id = id;
    }

    public Vente(String id, Long quantite, Date dateVente, String Employe) {
        this.id = id;
        this.quantite = quantite;
        this.dateVente = dateVente;
        this.Employe = Employe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Date getDateVente() {
        return dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public String getEmploye() {
        return Employe;
    }

    public void setEmploye(String Employe) {
        this.Employe = Employe;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Vente other = (Vente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vente{" + "id=" + id + ", article=" + article + ", quantite=" + quantite + ", dateVente=" + dateVente + ", Employe=" + Employe + '}';
    }

}
