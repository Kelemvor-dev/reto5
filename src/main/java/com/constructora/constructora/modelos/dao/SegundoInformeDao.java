package com.constructora.constructora.modelos.dao;

import com.constructora.constructora.modelos.vo.SegundoInformeVo;
import com.constructora.constructora.util.ConexionDB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class SegundoInformeDao {
    String connectQuery = null;
    ObservableList<SegundoInformeVo> proyectoslist = FXCollections.observableArrayList();
    public ObservableList<SegundoInformeVo> getSegundoInforme(){

        try {
            ConexionDB connectNow = new ConexionDB();
            Connection connectDB = connectNow.getDBConnection();
            if(connectQuery == null){
                connectQuery = "SELECT p.ID_Proyecto, p.Constructora, p.Numero_Habitaciones, p.Ciudad FROM Proyecto p \n" +
                        "WHERE p.Clasificacion = \"Casa Campestre\" AND p.Ciudad = \"Santa Marta\" OR p.Ciudad = \"Cartagena\" OR p.Ciudad = \"Barranquilla\"";
            }
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(connectQuery);

            while (queryResult.next()) {
                proyectoslist.add(new SegundoInformeVo(
                        queryResult.getInt("ID_Proyecto"),
                        queryResult.getString("Constructora"),
                        queryResult.getInt("Numero_Habitaciones"),
                        queryResult.getString("Ciudad")
                ));
            }
            return proyectoslist;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
