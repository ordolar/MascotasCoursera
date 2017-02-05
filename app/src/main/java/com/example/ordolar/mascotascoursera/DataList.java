package com.example.ordolar.mascotascoursera;

/**
 * Created by Ordolar on 31/01/2017.
 */

public class DataList {
    private String header;
    //private String detail;
    private int imagen;

    public DataList(String header,int imagen) {
        this.header = header;
        //this.detail = detail;
        this.imagen = imagen;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    /*public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }*/

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
