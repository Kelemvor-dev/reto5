package com.constructora.constructora.modelos.dao;

import com.constructora.constructora.modelos.vo.TercerInformeVo;
import com.constructora.constructora.util.ConexionDB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class TercerInformeDao {
    String connectQuery = null;
    ObservableList<TercerInformeVo> proyectoslist = FXCollections.observableArrayList();
    public ObservableList<TercerInformeVo> getTercerInforme(){

        try {
            ConexionDB connectNow = new ConexionDB();
            Connection connectDB = connectNow.getDBConnection();
            if(connectQuery == null){
                connectQuery = "SELECT c.ID_Compra, c.Proveedor,p.Ciudad, p.Constructora, p.Banco_Vinculado FROM Compra c \n" +
                        "INNER JOIN Proyecto p on p.ID_Proyecto = c.ID_Proyecto\n" +
                        "WHERE c.Proveedor = \"Homecenter\" AND p.Ciudad = \"Salento\"";
            }
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(connectQuery);

            while (queryResult.next()) {
                proyectoslist.add(new TercerInformeVo(
                        queryResult.getInt("ID_Compra"),
                        queryResult.getString("Proveedor"),
                        queryResult.getString("Ciudad"),
                        queryResult.getString("Constructora"),
                        queryResult.getString("Banco_Vinculado")
                ));
            }
            return proyectoslist;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
