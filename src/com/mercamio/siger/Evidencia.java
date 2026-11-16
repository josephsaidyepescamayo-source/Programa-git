
package com.mercamio.siger;

import java.util.Date;

public class Evidencia {

    // Atributos de la clase
    private int idEvidencia;
    private String urlArchivo;
    private String tipoArchivo;
    private Date fechaCaptura;
    private double tamanoArchivo;

    // Constructor
    public Evidencia(int idEvidencia, String urlArchivo,
                     String tipoArchivo, Date fechaCaptura,
                     double tamanoArchivo) {

        this.idEvidencia = idEvidencia;
        this.urlArchivo = urlArchivo;
        this.tipoArchivo = tipoArchivo;
        this.fechaCaptura = fechaCaptura;
        this.tamanoArchivo = tamanoArchivo;
    }

    // Métodos get y set
    public int getIdEvidencia() {
        return idEvidencia;
    }

    public void setIdEvidencia(int idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public String getUrlArchivo() {
        return urlArchivo;
    }

    public void setUrlArchivo(String urlArchivo) {
        this.urlArchivo = urlArchivo;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    // Métodos principales
    public void subirEvidencia() {
        System.out.println("Proceso de carga de evidencia solicitado.");
    }

    public void visualizarEvidencia() {
        System.out.println("Visualización de evidencia: " + urlArchivo);
    }
}
