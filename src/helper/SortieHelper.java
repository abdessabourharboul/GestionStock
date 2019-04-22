/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Sortie;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author moulaYounes
 */
public class SortieHelper extends AbstractHelper<Sortie> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("NUMERO DE SORTIE", "id"),
            new AbstractHelperItem("ARTICLE ID", "article"),
            new AbstractHelperItem("QUANTITE", "quantite"),
            new AbstractHelperItem("PRIX DE VENTE", "prixVente"),
            new AbstractHelperItem("DATE DE SORTIE", "dateSortie"),
            new AbstractHelperItem("EMPLOYE", "Employe"),
        };
    }

    public SortieHelper(JTable jTable, List<Sortie> list) {
        super(titres, jTable, list);
    }

    public SortieHelper(JTable jTable) {
        super(titres, jTable);

    }

}
