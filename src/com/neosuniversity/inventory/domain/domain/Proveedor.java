package com.neosuniversity.inventory.domain.domain;

import java.util.*;

/**
 * @author Mario Hidalgo
 */
public class Proveedor {

    /**
     * Default constructor
     */
    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombreProveedor, String direccionProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.direccionProveedor = direccionProveedor;
    }

    /**
     * 
     */
    private int idProveedor;

    /**
     * 
     */
    private String nombreProveedor;

    /**
     * 
     */
    private String direccionProveedor;

    /**
     * 
     */
    private int telefono;


    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @param proveedor
     */
    public void agregarProveedor(String proveedor) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void mostrar() {
        // TODO implement here
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idProveedor=" + idProveedor +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", direccionProveedor='" + direccionProveedor + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}