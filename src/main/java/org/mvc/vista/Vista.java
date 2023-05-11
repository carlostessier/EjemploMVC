package org.mvc.vista;

import javax.swing.*;

public class Vista extends JFrame{
    private JTextField campoNombre;
    private JLabel Nombre;
    private JButton btnGuardar;
    private JTextArea textArea1;
    private JButton btnMostrar;
    private JPanel principal;

    public Vista(){
        super("MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(principal);
        principal.setSize(300,300);
        pack();
        setVisible(true);
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public void setCampoNombre(JTextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public JLabel getNombre() {
        return Nombre;
    }

    public void setNombre(JLabel nombre) {
        Nombre = nombre;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JButton getBtnMostrar() {
        return btnMostrar;
    }

    public void setBtnMostrar(JButton btnMostrar) {
        this.btnMostrar = btnMostrar;
    }

    public JPanel getPrincipal() {
        return principal;
    }

    public void setPrincipal(JPanel principal) {
        this.principal = principal;
    }
}
