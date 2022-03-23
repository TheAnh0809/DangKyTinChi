package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.LichHoc;
import com.ptit.dangkytinchi.model.LopHocPhan;
import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LichHocRepository  extends JpaRepository<LichHoc, String> {
    List<LichHoc> findLichHocByMaLichHoc(String maLichHoc);
    List<LichHoc> findLichHocByLopHocPhan_MaLopHocPhan(String maLopHocPhan);
}
