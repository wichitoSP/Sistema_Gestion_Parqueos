package org.example.dao.impl;

import org.example.dao.TarifaDao;
import org.example.model.TarifaModel;

import java.util.ArrayList;
import java.util.List;

public class TarifaDaoImpl implements TarifaDao {

    private List<TarifaModel> tarifas;

    @Override
    public void crear(TarifaModel tarifaModel) {

        tarifas.add(tarifaModel);

    }

    @Override
    public TarifaModel leer(int id) {
        return tarifas.stream()
                .filter(c -> c.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void actualizar(TarifaModel tarifaModel) {

        TarifaModel existente = leer(tarifaModel.getId());
        if (existente != null){
            existente.setId(tarifaModel.getId());
        }

    }

    @Override
    public void eliminar(int id) {

        tarifas.removeIf(c -> c.getId()== id);

    }

    @Override
    public List<TarifaModel> listarTodos() {
        return new ArrayList<>(tarifas);
    }
}
