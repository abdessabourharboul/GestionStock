package bean;

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
public class Article {

    private String id;
    private String libelle;
    private Long prixEntree;
    private Long quantite;
    private String dateEntree;
    private String employe;
    private String description;
    private Fournisseur fournisseur = new Fournisseur();

    public Article() {
    }

    public Article(String id) {
        this.id = id;
    }

    public Article(String id, String libelle, Long prixEntree, Long quantite, String dateEntree, String employe, String description) {
        this.id = id;
        this.libelle = libelle;
        this.prixEntree = prixEntree;
        this.quantite = quantite;
        this.dateEntree = dateEntree;
        this.employe = employe;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getPrixEntree() {
        return prixEntree;
    }

    public void setPrixEntree(Long prixEntree) {
        this.prixEntree = prixEntree;
    }

    public String getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(String dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getEmploye() {
        return employe;
    }

    public void setEmploye(String employe) {
        this.employe = employe;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Article other = (Article) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", libelle=" + libelle + ", prixEntree=" + prixEntree + ", quantite=" + quantite + ", dateEntree=" + dateEntree + ", employe=" + employe + ", description=" + description + ", fournisseur=" + fournisseur + '}';
    }

}
