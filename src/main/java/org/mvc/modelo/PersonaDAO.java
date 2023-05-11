package org.mvc.modelo;

import java.util.List;

public interface PersonaDAO {

    public void insertar(Persona persona);

    public Persona buscarPorNombre(String nombre);

    public void eliminar(Persona persona);

    public void modificar(Persona persona);

    public List<Persona> listar();
}
