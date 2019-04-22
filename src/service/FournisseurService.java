/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Fournisseur;
import dao.AbstractDao;

/**
 *
 * @author asus
 */
public class FournisseurService extends AbstractDao<Fournisseur> {

    public FournisseurService() {
        super(Fournisseur.class);
    }

}
