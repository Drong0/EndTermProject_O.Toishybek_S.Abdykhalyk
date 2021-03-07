package com.company.StartProject;

import com.company.Repositories.Interface;
import com.company.Repositories.Methods;
import com.company.StorePanel;
import com.company.data.IDB;
import com.company.data.PostgreDB;

public class Main {

    public static void main(String[] args) {
        IDB db =new PostgreDB();
        Interface repo= new Methods(db);
        StorePanel controller= new StorePanel(repo);
        Start app=new Start(controller);
        app.start();
    }
}
