package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.BoMon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoMonRepository extends JpaRepository<BoMon, String> {
}
