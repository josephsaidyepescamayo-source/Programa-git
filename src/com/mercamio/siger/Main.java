package com.mercamio.siger;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
            1, "Carlos Pérez", "carlos@mercamio.com",
            "hash123", "Administrador", true
        );

        Incidente incidente = new Incidente(
            1, new Date(), "Seguridad",
            "Incidente de prueba",
            "Sede principal", "Pendiente", "Alta"
        );

        incidente.setUsuario(usuario);

        System.out.println("SISTEMA SIGER-MERCAMÍO");
        System.out.println("----------------------");
        System.out.println("Usuario: " + usuario.getNombreCompleto());
        System.out.println("Incidente: " + incidente.getDescripcion());
        System.out.println("Estado: " + incidente.getEstado());

        System.out.println("----------------------");
        System.out.println("Prueba ejecutada correctamente.");
    }
}