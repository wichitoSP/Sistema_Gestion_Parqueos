package org.example.model;

public class VheiculoModel {

    private String placa;
    private String tipo;
    private String marca;
    private String color;


    public VheiculoModel() {
    }

    public VheiculoModel(String placa, String tipo, String marca, String color) {
        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
