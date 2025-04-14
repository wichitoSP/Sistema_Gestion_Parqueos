package org.example.dao;

import org.example.model.TarifaModel;

import java.util.List;

public interface TarifaDao {
    void crear(TarifaModel tarifaModel);
    TarifaModel leer(int id);
    void actualizar(TarifaModel tarifaModel);
    void  eliminar(int id);
    List<TarifaModel>listarTodos();

}
