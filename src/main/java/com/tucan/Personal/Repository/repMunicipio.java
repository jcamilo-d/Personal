package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repMunicipio extends JpaRepository<Municipio,Integer> {
}
