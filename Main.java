package org.example;

import org.example.impl.AppInitialisationImpl;
import org.example.impl.ListOfPersonAppImpl;
import org.example.impl.PersonRepositoryImpl;
import org.example.interfaces.AppInitialisation;
import org.example.interfaces.PersonRepository;

public class Main {
    private static PersonRepository listRepoPerson;
    public static void main(String[] args) {
        //1 иниц-я
        listRepoPerson = new PersonRepositoryImpl();
        AppInitialisation appInitialisation = new AppInitialisationImpl();
        appInitialisation.initialize(listRepoPerson);

        //запуск
        ListOfPersonAppImpl.doRun(listRepoPerson);
    }
}