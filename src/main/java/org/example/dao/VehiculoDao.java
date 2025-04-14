package org.example.dao;

import org.example.model.VheiculoModel;

import java.util.List;

public interface VehiculoDao {

    void crear (VheiculoModel vheiculoModel);
    VheiculoModel leer (int id);
    void actualizar(VheiculoModel vheiculoModel);
    void eliminar(int id);
    List<VheiculoModel> listaTodos();
    


}
