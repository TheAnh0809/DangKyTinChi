package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.DTO.SinhVienDTO;
import com.ptit.dangkytinchi.model.PhongHoc;
import com.ptit.dangkytinchi.model.SinhVien;
import com.ptit.dangkytinchi.model.SinhVienKhoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SinhVienKhoaRepository extends JpaRepository<SinhVienKhoa, String> {
}
