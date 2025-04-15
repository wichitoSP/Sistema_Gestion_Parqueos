package org.example.dao;

import org.example.model.ParqueoModel;

import java.util.List;

public interface ParqueoDao {

    void crear(ParqueoModel parqueoModel);
    ParqueoModel leer (int id);
    void actualizar(ParqueoModel parqueoModel);
    void eliminar(int id);
    List<ParqueoModel> listaTodos();
    




}
