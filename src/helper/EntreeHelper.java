/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Entree;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author moulaYounes
 */
public class EntreeHelper extends AbstractHelper<Entree> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("NUMERO D'ENTREE", "id"),
            new AbstractHelperItem("ARTICLE ID", "article"),
            new AbstractHelperItem("QUANTITE", "quantite"),
            new AbstractHelperItem("PRIX DE VENTE", "prixVente"),
            new AbstractHelperItem("DATE D'ENTREE", "dateEntree"),
            new AbstractHelperItem("EMPLOYE", "Employe"),
        };
    }

    public EntreeHelper(JTable jTable, List<Entree> list) {
        super(titres, jTable, list);
    }

    public EntreeHelper(JTable jTable) {
        super(titres, jTable);

    }

}
