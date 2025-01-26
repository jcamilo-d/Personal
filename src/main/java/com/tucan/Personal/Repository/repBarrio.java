package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.Barrio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repBarrio extends JpaRepository<Barrio,Integer> {
}
