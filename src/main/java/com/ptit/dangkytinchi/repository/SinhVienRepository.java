package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.SinhVien;
import com.ptit.dangkytinchi.model.SinhVienKhoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SinhVienRepository extends JpaRepository<SinhVien, String> {
    SinhVien findOneByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);
}
