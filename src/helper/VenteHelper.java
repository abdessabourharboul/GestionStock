/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Vente;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author moulaYounes
 */
public class VenteHelper extends AbstractHelper<Vente> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID PRODUIT", "id"),
            new AbstractHelperItem("LIBELLE", "libelle"),
            new AbstractHelperItem("QUANTITE", "quantite"),
            new AbstractHelperItem("DESCRIPTION", "description"),
            new AbstractHelperItem("FOURNISSEUR", "fournisseur"),
        };
    }

    public VenteHelper(JTable jTable, List<Vente> list) {
        super(titres, jTable, list);
    }

    public VenteHelper(JTable jTable) {
        super(titres, jTable);

    }

}
