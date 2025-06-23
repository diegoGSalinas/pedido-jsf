package Beans;

import Modelo.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ProductoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Producto> listaProductos;

    public ProductoBean() {
        listaProductos = new ArrayList<>();
        cargarProductos();
    }

    private void cargarProductos() {
        listaProductos.add(new Producto("Expedition 33", 135.0, 40));
        listaProductos.add(new Producto("Baldur's Gate 3", 200.0, 30));
        listaProductos.add(new Producto("Undertale", 40.0, 80));
        listaProductos.add(new Producto("Callisto Protocol", 190.0, 20));
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

}
