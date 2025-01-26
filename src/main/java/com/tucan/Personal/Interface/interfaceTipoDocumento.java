package com.tucan.Personal.Interface;

import com.tucan.Personal.Model.TipoDocumento;

import java.util.List;
import java.util.Optional;

public interface interfaceTipoDocumento {
    public List<TipoDocumento> listDocumentos();
    public void guardar(TipoDocumento tipoDocumento);
    public Optional<TipoDocumento> editar(int id);
    public void eliminar(int id);
}
