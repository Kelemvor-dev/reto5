package com.constructora.constructora.modelos.vo;

public class SegundoInformeVo {
    Integer ID_Proyecto,Numero_Habitaciones;
    String Constructora,Ciudad;

    public SegundoInformeVo(Integer ID_Proyecto, String Constructora, Integer Numero_Habitaciones, String Ciudad){
        this.ID_Proyecto = ID_Proyecto;
        this.Constructora = Constructora;
        this.Numero_Habitaciones = Numero_Habitaciones;
        this.Ciudad = Ciudad;
    }

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }

    public Integer getNumero_Habitaciones() {
        return Numero_Habitaciones;
    }

    public void setNumero_Habitaciones(Integer numero_Habitaciones) {
        Numero_Habitaciones = numero_Habitaciones;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
}
