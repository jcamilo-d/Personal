package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.Eps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repEps extends JpaRepository<Eps,Integer> {
}
