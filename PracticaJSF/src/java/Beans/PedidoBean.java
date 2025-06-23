package Beans;

import Modelo.Producto;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@Named
@SessionScoped
public class PedidoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombreCliente;
    private String correo;
    private Producto productoSeleccionado;
    private int cantidad;
    private String fechaPedido;

    private void actualizarFecha() {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        fechaPedido = formato.format(new Date());
    }

    public String enviarPedido() {
        if (productoSeleccionado != null && cantidad > 0) {
            if (cantidad <= productoSeleccionado.getStock()) {
                actualizarFecha();

                FacesContext.getCurrentInstance().addMessage(null,
                        new jakarta.faces.application.FacesMessage("Pedido enviado correctamente"));
                return "confirmacion.xhtml";
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new jakarta.faces.application.FacesMessage(
                                jakarta.faces.application.FacesMessage.SEVERITY_ERROR,
                                "Error", "No hay suficiente stock del producto seleccionado"));
                return null;
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new jakarta.faces.application.FacesMessage(
                            jakarta.faces.application.FacesMessage.SEVERITY_ERROR,
                            "Error", "Por favor complete todos los campos"));
            return null;
        }
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
}
