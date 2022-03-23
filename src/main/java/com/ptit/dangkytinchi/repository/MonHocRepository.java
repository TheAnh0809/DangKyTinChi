package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.MonHoc;
import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonHocRepository  extends JpaRepository<MonHoc, String> {
}
