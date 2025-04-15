package org.example.model;

public class TarifaModel {

    private int id;
    private String tipoVheiculo;
    private double precioHora;
    private double precioDia;

    public TarifaModel() {
    }

    public TarifaModel(int id, String tipoVheiculo, double precioHora, double precioDia) {
        this.id = id;
        this.tipoVheiculo = tipoVheiculo;
        this.precioHora = precioHora;
        this.precioDia = precioDia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoVheiculo() {
        return tipoVheiculo;
    }

    public void setTipoVheiculo(String tipoVheiculo) {
        this.tipoVheiculo = tipoVheiculo;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }
}
