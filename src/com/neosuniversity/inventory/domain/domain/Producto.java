package com.neosuniversity.inventory.domain.domain;

import java.util.*;

/**
 * @author Mario Hidalgo
 */
public class Producto {

    /**
     * Default constructor
     */
    public Producto() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Marca marca;

    /**
     * 
     */
    private Proveedor proveedor;

    public Producto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Producto(String id, String nombre, Marca marca, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.proveedor = proveedor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca=" + marca +
                ", proveedor=" + proveedor +
                '}';
    }
}