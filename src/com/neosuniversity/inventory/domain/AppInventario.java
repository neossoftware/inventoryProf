package com.neosuniversity.inventory.domain;

import com.neosuniversity.inventory.domain.domain.Marca;
import com.neosuniversity.inventory.domain.domain.Producto;
import com.neosuniversity.inventory.domain.domain.Proveedor;

public class AppInventario {

    public static void main(String[] args) {

        Marca m1 = new Marca();

        m1.setIdMarca("PRD-234");
        m1.setNombreMarca("Apple");

        System.out.println(m1);

        Proveedor p1 = new Proveedor(123,"Mercado Libre", "CD MEX");

        System.out.println(p1);

        System.out.println(p1.getDireccionProveedor());


        Producto producto = new Producto("SKU-324234","Iphone X");
        producto.setMarca(m1);
        producto.setProveedor(p1);

        System.out.println(producto);








    }
}
