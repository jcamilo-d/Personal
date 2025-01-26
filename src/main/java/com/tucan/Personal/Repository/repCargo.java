package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repCargo extends JpaRepository<Cargo,Integer> {
}
