package org.zutjmx.webapp.jsf3.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.zutjmx.webapp.jsf3.entities.Producto;
import org.zutjmx.webapp.jsf3.services.ProductoService;

import java.util.Arrays;
import java.util.List;

@Model
public class ProductoController {

    @Inject
    private ProductoService productoService;

    @Produces
    @Model
    public String titulo() {
        return "Hola Mundo Java Server Faces 3.0";
    }

    @Produces
    @RequestScoped
    @Named("listado")
    public List<Producto> findAll() {
        /*return Arrays.asList(new Producto("Peras"),
                new Producto("Manzanas"),
                new Producto("Guayabas"),
                new Producto("Pitayas"));*/
        return productoService.listar();
    }

}
