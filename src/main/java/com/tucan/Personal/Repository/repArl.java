package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.Arl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repArl extends JpaRepository<Arl,Integer> {
}
