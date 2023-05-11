package org.mvc;

import org.mvc.controlador.Controlador;
import org.mvc.modelo.Persona;
import org.mvc.modelo.PersonaDAOSqlite;
import org.mvc.vista.Vista;

import java.net.ContentHandler;

public class Main {
    public static void main(String[] args) {

       new Controlador();
    }
}