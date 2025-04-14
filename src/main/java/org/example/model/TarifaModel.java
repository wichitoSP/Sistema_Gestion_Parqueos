package org.example.model;

public class TarifaModel {

    private String tipoVheiculo;
    private double precioHora;
    private double precioDia;

    public TarifaModel() {
    }

    public TarifaModel(String tipoVheiculo, double precioHora, double precioDia) {
        this.tipoVheiculo = tipoVheiculo;
        this.precioHora = precioHora;
        this.precioDia = precioDia;
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
