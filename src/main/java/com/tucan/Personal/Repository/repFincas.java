package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.Fincas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repFincas extends JpaRepository<Fincas,Integer> {
}
