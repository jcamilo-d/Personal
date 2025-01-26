package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repTipoDocumento extends JpaRepository<TipoDocumento,Integer> {
}
