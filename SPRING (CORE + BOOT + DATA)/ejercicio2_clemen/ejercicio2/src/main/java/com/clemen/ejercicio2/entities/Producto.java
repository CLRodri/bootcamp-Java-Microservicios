package com.clemen.ejercicio2.entities;

public class Producto {

    private Long id;
    private String nombre;
    private Double pvp;
    private Double pvd;
    private Pedido pedido;

    public Producto() {
    }

    public Producto(Long id, String nombre, Double pvp, Double pvd,Pedido pedido) {
        this.id = id;
        this.nombre = nombre;
        this.pvp = pvp;
        this.pvd = pvd;
        this.pedido = pedido;
    }

    public Double getPvd() {
        return pvd;
    }

    public void setPvd(Double pvd) {
        this.pvd = pvd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPvp() {
        return pvp;
    }

    public void setPvp(Double pvp) {
        this.pvp = pvp;
    }


    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
