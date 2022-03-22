package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, String> {
    SinhVien findOneByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);
}
