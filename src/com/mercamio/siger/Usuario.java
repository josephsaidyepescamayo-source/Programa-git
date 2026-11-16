 
package com.mercamio.siger;

public class Usuario {

    // Atributos de la clase
    private int idUsuario;
    private String nombreCompleto;
    private String correo;
    private String contrasenaHash;
    private String rol;
    private Boolean estado;

    // Método para iniciar sesión
    public Boolean iniciarSesion() {
        return false;
    }

    // Método para cerrar sesión
    public void cerrarSesion() {
        System.out.println("Sesión cerrada.");
    }

    // Método para cambiar contraseña
    public void cambiarContrasena() {
        System.out.println("Proceso de cambio de contraseña.");
    }

    // Método para registrar un incidente
    public void registrarIncidente() {
        System.out.println("Registro de incidente solicitado.");
    }


    // Constructor de la clase
    public Usuario(int idUsuario, String nombreCompleto,
                   String correo, String contrasenaHash,
                   String rol, Boolean estado) {

        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.contrasenaHash = contrasenaHash;
        this.rol = rol;
        this.estado = estado;
    }

    // Métodos get y set
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenaHash() {
        return contrasenaHash;
    }

    public void setContrasenaHash(String contrasenaHash) {
        this.contrasenaHash = contrasenaHash;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
