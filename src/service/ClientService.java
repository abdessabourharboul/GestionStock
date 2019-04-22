/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import dao.AbstractDao;

/**
 *
 * @author asus
 */
public class ClientService extends AbstractDao<Client> {

    public ClientService() {
        super(Client.class);
    }

}
