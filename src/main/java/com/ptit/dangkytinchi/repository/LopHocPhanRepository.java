package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.LopHocPhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LopHocPhanRepository extends JpaRepository<LopHocPhan, String> {
}
