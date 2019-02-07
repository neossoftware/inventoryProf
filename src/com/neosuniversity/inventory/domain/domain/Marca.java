package com.neosuniversity.inventory.domain.domain;

import java.util.*;

/**
 * @author Mario Hidalgo
 */
public class Marca {

    /**
     * Default constructor
     */
    public Marca() {
    }

    /**
     * 
     */
    private String idMarca;

    /**
     * 
     */
    private String nombreMarca;

    public String getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(String idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    /**
     * @param marca 
     * @return
     */
    public void agregarMarca(String marca) {
        // TODO implement here

    }


    @Override
    public String toString() {
        return "Marca{" +
                "idMarca='" + idMarca + '\'' +
                ", nombreMarca='" + nombreMarca + '\'' +
                '}';
    }
}