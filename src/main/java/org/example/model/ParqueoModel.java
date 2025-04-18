package org.example.model;

import java.time.LocalDateTime;

public class ParqueoModel {


    private int id;
    private VheiculoModel vheiculo;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private double tarifaAplicada;

    public ParqueoModel() {

    }

    public ParqueoModel(int id, VheiculoModel vheiculo, LocalDateTime horaEntrada, LocalDateTime horaSalida, double tarifaAplicada) {
        this.id = id;
        this.vheiculo = vheiculo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tarifaAplicada = tarifaAplicada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VheiculoModel getVheiculo() {
        return vheiculo;
    }

    public void setVheiculo(VheiculoModel vheiculo) {
        this.vheiculo = vheiculo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double getTarifaAplicada() {
        return tarifaAplicada;
    }

    public void setTarifaAplicada(double tarifaAplicada) {
        this.tarifaAplicada = tarifaAplicada;
    }
}
