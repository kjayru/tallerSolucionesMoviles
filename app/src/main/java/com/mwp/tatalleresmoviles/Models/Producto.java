package com.mwp.tatalleresmoviles.Models;

public class Producto {

    private int producto_id;
    private String titulo;
    private String imagen;
    private String descripcion;
    private Double price;
    private int stock;
    private String categoria;

    public Producto(){

    }
    public Producto(int producto_id, String titulo, String imagen, String descripcion, Double price, int stock, String categoria){
        this.producto_id = producto_id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.price = price;
        this.stock = stock;
        this.categoria = categoria;

    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
