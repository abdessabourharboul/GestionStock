/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Commande;
import bean.LigneCommande;
import dao.AbstractDao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class LigneCommandeService extends AbstractDao<LigneCommande> {

    public LigneCommandeService() {
        super(LigneCommande.class);
    }

    public List<LigneCommande> findByCommand(Commande commande) {
        String requeta = "select * from lignecommande where commande = " + commande.getId();
        try {
            return load(requeta);
        } catch (Exception ex) {
            Logger.getLogger(LigneCommandeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }
}
