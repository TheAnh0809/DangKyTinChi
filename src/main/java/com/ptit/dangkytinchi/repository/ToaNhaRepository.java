package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.ToaNha;
import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToaNhaRepository extends JpaRepository<ToaNha, String> {
}
