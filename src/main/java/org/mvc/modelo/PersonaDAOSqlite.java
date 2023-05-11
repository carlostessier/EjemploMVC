package org.mvc.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAOSqlite implements PersonaDAO {

    private Connection conection;

    public PersonaDAOSqlite(){
        try {
            this.conection = DriverManager.getConnection("jdbc:sqlite:bbdd/personas.db");
            System.out.println("Conexión establecida con la base de datos");
            crearTabla();
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos");
        }
    }

    public void crearTabla(){
        try {
            conection.createStatement().executeUpdate(
                    "CREATE TABLE IF NOT EXISTS personas (" +
                    "id integer primary key autoincrement," +
                    "nombre TEXT unique)");
            System.out.println("Tabla creada con éxito");
        } catch (SQLException e) {
            System.err.println("Error al crear la tabla");
        }
    }

    @Override
    public void insertar(Persona persona) {
        try(Statement st = conection.createStatement()){
            st.executeUpdate("INSERT INTO personas (nombre) VALUES ('"+persona.getNombre()+"')");
        } catch (SQLException e){
            System.err.println("Error al insertar persona");
        }

    }

    @Override
    public Persona buscarPorNombre(String nombre) {
        return null;
    }

    @Override
    public void eliminar(Persona persona) {

    }

    @Override
    public void modificar(Persona persona) {

    }

    @Override
    public List<Persona> listar() {
        ArrayList<Persona> personas = new ArrayList<>();
        try(Statement st = conection.createStatement()){
            ResultSet rs = st.executeQuery("SELECT * FROM personas");
            while(rs.next()){
                personas.add(new Persona(rs.getString("nombre")));
            }
            rs.close();
        } catch (SQLException e){
            System.err.println("Error al listar personas");
        }

        return personas;

    }
}
