/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Vente;
import dao.AbstractDao;

/**
 *
 * @author asus
 */
public class VenteService extends AbstractDao<Vente> {

    public VenteService() {
        super(Vente.class);
    }

}
