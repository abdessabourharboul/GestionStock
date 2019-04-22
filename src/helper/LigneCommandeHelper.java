/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.LigneCommande;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author moulaYounes
 */
public class LigneCommandeHelper extends AbstractHelper<LigneCommande> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Article", "article"),
            new AbstractHelperItem("Prixvente", "prixVente"),
            new AbstractHelperItem("QUANTITE", "quantite"),
            
        };
    }

    public LigneCommandeHelper(JTable jTable, List<LigneCommande> list) {
        super(titres, jTable, list);
    }

    public LigneCommandeHelper(JTable jTable) {
        super(titres, jTable);

    }

}
