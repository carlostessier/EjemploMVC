package org.mvc.controlador;

import org.mvc.modelo.Persona;
import org.mvc.modelo.PersonaDAOSqlite;
import org.mvc.vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.util.List;
public class Controlador {
    private PersonaDAOSqlite modelo;
    private Vista vista;

    public Controlador() {
        modelo = new PersonaDAOSqlite();
        vista = new Vista();

        vista.getBtnGuardar().addActionListener(e -> {
            insertar();
        });

        vista.getBtnMostrar().addActionListener(e -> {
            mostrarTodos();
        });

    }

    private void mostrarTodos() {
        List<Persona> personas= modelo.listar();
        String texto = "";
        for (Persona persona: personas) {
            texto += persona.getNombre() + "\n";
        }
        vista.getTextArea1().setText(texto);
    }

    private void insertar() {
        String nombre = vista.getCampoNombre().getText().trim().toLowerCase();
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio", "Ventana emergente", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            Persona persona = new Persona(nombre);
            modelo.insertar(persona);
            JOptionPane.showMessageDialog(null, "Persona insertada: " + nombre, "Ventana emergente", JOptionPane.INFORMATION_MESSAGE);
        }
        }

}
