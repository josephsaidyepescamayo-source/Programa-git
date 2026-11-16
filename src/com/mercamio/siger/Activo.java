
package com.mercamio.siger;

public class Activo {

    // Atributos de la clase
    private int idActivo;
    private String codigoInventario;
    private String nombre;
    private String categoria;
    private String estado;
    private String ubicacion;

    // Constructor
    public Activo(int idActivo, String codigoInventario,
                  String nombre, String categoria,
                  String estado, String ubicacion) {

        this.idActivo = idActivo;
        this.codigoInventario = codigoInventario;
        this.nombre = nombre;
        this.categoria = categoria;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    // Métodos get y set
    public int getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public String getCodigoInventario() {
        return codigoInventario;
    }

    public void setCodigoInventario(String codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Método para actualizar el estado
    public void actualizarEstado() {
        System.out.println("Actualización del estado del activo.");
    }

    // Método para consultar el activo
    public void consultarActivo() {
        System.out.println("Consulta del activo: " + nombre);
    }
}
