package org.example.dao.impl;

import org.example.dao.ParqueoDao;
import org.example.model.ParqueoModel;

import java.util.ArrayList;
import java.util.List;

public class ParqueoDaoImpl implements ParqueoDao {

    private List<ParqueoModel> parqueos;

    @Override
    public void crear(ParqueoModel parqueoModel) {

        parqueos.add(parqueoModel);

    }

    @Override
    public ParqueoModel leer(int id) {
        return parqueos.stream()
                .filter(c -> c.getId()== id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void actualizar(ParqueoModel parqueoModel) {

        ParqueoModel existente = leer(parqueoModel.getId());
        if (existente !=null){
            existente.setId(parqueoModel.getId());
        }



    }

    @Override
    public void eliminar(int id) {

        parqueos.removeIf(c -> c.getId() == id);

    }

    @Override
    public List<ParqueoModel> listaTodos() {
        return new  ArrayList<>(parqueos);
    }
}
