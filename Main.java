package org.example;

import org.example.impl.ListOfPersonAppImpl;
import org.example.impl.PersonRepositoryImpl;
import org.example.interfaces.PersonRepository;

import java.sql.SQLException;

public class Main {
    private static PersonRepository listRepoPerson;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        listRepoPerson = new PersonRepositoryImpl();
  /*      AppInitialisation appInitialisation = new AppInitialisationImpl();
        appInitialisation.initialize(listRepoPerson);*/
        ListOfPersonAppImpl.doRun(listRepoPerson);
    }
}