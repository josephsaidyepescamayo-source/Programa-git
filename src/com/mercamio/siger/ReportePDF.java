
package com.mercamio.siger;

import java.util.Date;

public class ReportePDF {

    // Atributos de la clase
    private int idReporte;
    private Date fechaGeneracion;
    private String rutaArchivo;

    // Constructor
    public ReportePDF(int idReporte, Date fechaGeneracion,
                      String rutaArchivo) {

        this.idReporte = idReporte;
        this.fechaGeneracion = fechaGeneracion;
        this.rutaArchivo = rutaArchivo;
    }

    // Métodos get y set
    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    // Método para generar reporte
    public void generarReporte() {
        System.out.println("Generación del reporte solicitada.");
    }

    // Método para exportar reporte en PDF
    public void exportarPDF() {
        System.out.println("Exportación del reporte PDF solicitada.");
    }
}
