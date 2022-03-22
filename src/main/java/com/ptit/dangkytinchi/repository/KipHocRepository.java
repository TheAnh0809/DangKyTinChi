package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.KipHoc;
import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KipHocRepository extends JpaRepository<KipHoc, String> {
}
