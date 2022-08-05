package com.constructora.constructora.modelos.dao;

import com.constructora.constructora.modelos.vo.PrimerInformeVo;
import com.constructora.constructora.util.ConexionDB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class PrimerInformeDao {
    String connectQuery = null;
    ObservableList<PrimerInformeVo> proyectosLista = FXCollections.observableArrayList();
    public ObservableList<PrimerInformeVo> getPrimerInforme(){

        try {
            ConexionDB connectNow = new ConexionDB();
            Connection connectDB = connectNow.getDBConnection();
            if(connectQuery == null){
                connectQuery = "SELECT l.ID_Lider,l.Nombre,l.Primer_Apellido,l.Ciudad_Residencia FROM Lider l \n" +
                        "ORDER BY l.Ciudad_Residencia ASC";
            }
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(connectQuery);

            while (queryResult.next()) {
                proyectosLista.add(new PrimerInformeVo(
                        queryResult.getInt("ID_Lider"),
                        queryResult.getString("Nombre"),
                        queryResult.getString("Primer_Apellido"),
                        queryResult.getString("Ciudad_Residencia")
                ));
            }
            return proyectosLista;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
