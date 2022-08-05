package com.constructora.constructora.modelos.vo;

public class TercerInformeVo {
    Integer ID_Compra;
    String Proveedor,Constructora,Ciudad,Banco_Vinculado;

    public TercerInformeVo(Integer ID_Compra,String Proveedor, String Ciudad, String Constructora, String Banco_Vinculado){
        this.ID_Compra = ID_Compra;
        this.Proveedor = Proveedor;
        this.Ciudad = Ciudad;
        this.Constructora = Constructora;
        this.Banco_Vinculado = Banco_Vinculado;

    }

    public Integer getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(Integer ID_Compra) {
        this.ID_Compra = ID_Compra;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
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

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String banco_Vinculado) {
        Banco_Vinculado = banco_Vinculado;
    }
}
