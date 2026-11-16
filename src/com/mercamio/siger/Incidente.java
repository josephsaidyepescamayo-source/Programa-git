package com.mercamio.siger;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Incidente {

    // Atributos propios
    private int idIncidente;
    private Date fechaRegistro;
    private String tipo;
    private String descripcion;
    private String ubicacion;
    private String estado;
    private String prioridad;

    // Relaciones con otras clases
    private Usuario usuario;
    private Activo activo;
    private ReportePDF reportePDF;
    private List<Evidencia> evidencias;
    private Tercero tercero;
    private Sede sede;

    // Constructor
    public Incidente(int idIncidente, Date fechaRegistro,
            String tipo, String descripcion, String ubicacion,
            String estado, String prioridad) {

        this.idIncidente = idIncidente;
        this.fechaRegistro = fechaRegistro;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.prioridad = prioridad;

        this.evidencias = new ArrayList<>();
    }

    // Getters y setters de los atributos propios
    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    // Métodos propios del incidente
    public void crearIncidente() {
        System.out.println("Incidente registrado correctamente.");
    }

    public void actualizarEstado() {
        System.out.println("Estado del incidente actualizado.");
    }

    // Relaciones con Usuario
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Relaciones con Activo
    public Activo getActivo() {
        return activo;
    }

    public void asignarActivo(Activo activo) {
        this.activo = activo;
    }

    // Relaciones con ReportePDF
    public ReportePDF getReportePDF() {
        return reportePDF;
    }

    public void setReportePDF(ReportePDF reportePDF) {
        this.reportePDF = reportePDF;
    }

    // Relaciones con Evidencia
    public List<Evidencia> getEvidencias() {
        return evidencias;
    }

    public void agregarEvidencia(Evidencia evidencia) {
        this.evidencias.add(evidencia);
    }

    // Relaciones con Tercero
    public Tercero getTercero() {
        return tercero;
    }

    public void asignarTercero(Tercero tercero) {
        this.tercero = tercero;
    }

    // Relaciones con Sede
    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}