package com.constructora.constructora.modelos.vo;

public class PrimerInformeVo {
    Integer ID_Lider;
    String Nombre,Primer_Apellido,Ciudad_Residencia;

    public PrimerInformeVo(Integer ID_Lider, String Nombre, String Primer_Apellido, String Ciudad_Residencia){
        this.ID_Lider = ID_Lider;
        this.Nombre = Nombre;
        this.Primer_Apellido = Primer_Apellido;
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public Integer getID_Lider() {
        return ID_Lider;
    }

    public void setID_Lider(Integer ID_Lider) {
        this.ID_Lider = ID_Lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }
}
