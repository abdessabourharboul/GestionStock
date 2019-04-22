/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Commande;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author moulaYounes
 */
public class CommandeHelper extends AbstractHelper<Commande> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID COMMANDE", "id"),
            new AbstractHelperItem("CLIENT ID", "client"),
            new AbstractHelperItem("DATE DE LIVRAISON", "dateLivraison"),
            new AbstractHelperItem("MANIERE DE LIVRAISON", "maniereLivraison"),
            
        };
    }

    public CommandeHelper(JTable jTable, List<Commande> list) {
        super(titres, jTable, list);
    }

    public CommandeHelper(JTable jTable) {
        super(titres, jTable);

    }

}
