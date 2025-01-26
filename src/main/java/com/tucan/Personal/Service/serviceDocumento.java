package com.tucan.Personal.Service;

import com.tucan.Personal.Interface.interfaceTipoDocumento;
import com.tucan.Personal.Model.TipoDocumento;
import com.tucan.Personal.Repository.repTipoDocumento;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class serviceDocumento implements interfaceTipoDocumento {
    @Autowired
    private repTipoDocumento repositorio;
    @Override
    public List<TipoDocumento> listDocumentos() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(TipoDocumento tipoDocumento) {
        repositorio.save(tipoDocumento);
    }

    @Override
    public Optional<TipoDocumento> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }
}
