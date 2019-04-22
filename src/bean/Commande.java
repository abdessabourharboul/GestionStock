package bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.CommandeService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class Commande {

    private int id;
    private Client client = new Client();
    private String dateLivraison;
    private String maniereLivraison;
    private String etat;
    private List<LigneCommande> ligneCommandes = new ArrayList<>();
    private static int cmp;

    CommandeService commandeService = new CommandeService();

//    public int generateId() {
//        cmp++;
//        id = cmp;
//        return id;
//    }
    public int generateId() {
        int rib;
        try {
            rib= commandeService.generateId();
        } catch (SQLException ex) {
            Logger.getLogger(Commande.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public Commande() {
        try {
            this.id = commandeService.generateId();
        } catch (SQLException ex) {
            Logger.getLogger(Commande.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public Commande(int id) {
//        this.id = id;
//    }
    public Commande(int id, String dateLivraison, String maniereLivraison, String etat) {
        try {
            id = commandeService.generateId();
        } catch (SQLException ex) {
            Logger.getLogger(Commande.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.id = id;
        this.dateLivraison = dateLivraison;
        this.maniereLivraison = maniereLivraison;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(String dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getManiereLivraison() {
        return maniereLivraison;
    }

    public void setManiereLivraison(String maniereLivraison) {
        this.maniereLivraison = maniereLivraison;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Commande other = (Commande) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", client=" + client + ", dateLivraison=" + dateLivraison + ", maniereLivraison=" + maniereLivraison + ", etat=" + etat + ", ligneCommandes=" + ligneCommandes + '}';
    }

}
