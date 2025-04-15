package org.example.dao.impl;

import org.example.dao.VehiculoDao;
import org.example.model.VheiculoModel;

import java.util.ArrayList;
import java.util.List;

public class VehiculoDaoImpl implements VehiculoDao {

    private List<VheiculoModel> vehiculos;

    @Override
    public void crear(VheiculoModel vheiculoModel) {
        vehiculos.add(vheiculoModel);

    }

    @Override
    public VheiculoModel leer(int id) {
        return vehiculos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void actualizar(VheiculoModel vheiculoModel) {

        VheiculoModel existente = leer(vheiculoModel.getId());
        if (existente != null){

            existente.setColor(vheiculoModel.getMarca());

        }



    }

    @Override
    public void eliminar(int id) {

        vehiculos.removeIf(c -> c.getId()== id);

    }

    @Override
    public List<VheiculoModel> listaTodos() {
        return new ArrayList<>(vehiculos);
    }
}
