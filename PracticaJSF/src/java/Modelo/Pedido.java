package Modelo;

import java.util.List;
import java.util.Date;

public class Pedido {

    private Cliente cliente;
    private String correo;
    private List<Producto> productos;
    private int cantidad;
    private Date fechaPedido;

    public Pedido() {
    }

    public Pedido(Cliente cliente, String correo, List<Producto> productos, int cantidad, Date fechaPedido) {
        this.cliente = cliente;
        this.correo = correo;
        this.productos = productos;
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getCorreo() {
        return correo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

}
