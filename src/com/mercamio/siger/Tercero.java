package com.mercamio.siger;

public class Tercero {

    private int idTercero;
    private String nombreCompleto;
    private String documento;
    private String telefono;

    public Tercero(int idTercero, String nombreCompleto,
                   String documento, String telefono) {

        this.idTercero = idTercero;
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.telefono = telefono;
    }

    public int getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(int idTercero) {
        this.idTercero = idTercero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void actualizarDatos() {
        System.out.println("Actualización de datos del tercero.");
    }
}