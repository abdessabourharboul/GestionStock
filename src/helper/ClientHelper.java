/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Client;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author moulaYounes
 */
public class ClientHelper extends AbstractHelper<Client> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID CLIENT", "id"),
            new AbstractHelperItem("NOM", "nom"),
            new AbstractHelperItem("ADRESSE", "adresse"),
            new AbstractHelperItem("TELEPHONE", "telephone"),
        };
    }

    public ClientHelper(JTable jTable, List<Client> list) {
        super(titres, jTable, list);
    }

    public ClientHelper(JTable jTable) {
        super(titres, jTable);

    }

}
