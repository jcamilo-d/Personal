package com.tucan.Personal.Repository;

import com.tucan.Personal.Model.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repArea extends JpaRepository<Area,Integer> {
}
