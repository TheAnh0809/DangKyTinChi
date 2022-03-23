package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.Khoa;
import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhoaRepository  extends JpaRepository<Khoa, String> {
}
