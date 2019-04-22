/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Commande;
import dao.AbstractDao;
import dao.CommandeDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class CommandeService extends AbstractDao<Commande> {

    public CommandeService() {
        super(Commande.class);
    }
    CommandeDao commandeDao = new CommandeDao();
    
    public int generateId() throws SQLException{
        String req="select max(id) from commande";
        return (int) (commandeDao.loadOne(req)+1);
    }

    public int finda(Commande myCommande) {
        Commande commandea = new Commande();
        try {
            commandea = findById(myCommande.getId());
        } catch (Exception ex) {
            Logger.getLogger(CommandeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return commandea.getId();

    }
    
    

}
