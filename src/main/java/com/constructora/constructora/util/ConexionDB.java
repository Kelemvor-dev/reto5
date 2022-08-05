package com.constructora.constructora.util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
    public Connection databaseLink;

    public Connection getDBConnection() throws MalformedURLException {

        URL db = new File("src/main/resources/com/constructora/constructora/db/ProyectosConstruccion.db").toURI().toURL();
        String url = "jdbc:sqlite:"+db;
        try {
            databaseLink = DriverManager.getConnection(url);
        }catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }
}
