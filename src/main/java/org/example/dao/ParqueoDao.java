package org.example.dao;

import org.example.model.ParqueoModel;

public interface ParqueoDao {

    void crear(ParqueoModel parqueoModel);
    ParqueoModel leer (int id);



}
