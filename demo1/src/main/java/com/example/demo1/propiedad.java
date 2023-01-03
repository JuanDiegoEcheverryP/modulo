package com.example.demo1;

public class propiedad {
    private String color;
    private String owner;
    private float precio;
    private float debePagar;
    private int casas;
    private boolean hotel;
    private boolean hipotecado;

    public propiedad(String color, float precio) {
        this.color = color;
        this.owner = null;
        this.precio = precio;
        this.debePagar = 0;
        this.casas = 0;
        this.hotel = false;
        this.hipotecado = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getDebePagar() {
        return debePagar;
    }

    public void setDebePagar(float debePagar) {
        this.debePagar = debePagar;
    }

    public int getCasas() {
        return casas;
    }

    public void setCasas(int casas) {
        this.casas = casas;
    }

    public boolean isHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public boolean isHipotecado() {
        return hipotecado;
    }

    public void setHipotecado(boolean hipotecado) {
        this.hipotecado = hipotecado;
    }
}
