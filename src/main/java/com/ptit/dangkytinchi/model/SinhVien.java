package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_sinh_vien", schema = "dangkytinchi")
public class SinhVien {

    @Id
    @Column(name = "masinhvien")
    private String maSinhVien;

    @Column(name = "taikhoan")
    private  String taiKhoan;

    @Column(name = "matkhau")
    private  String matKhau;

    @Column(name = "tensinhvien")
    private  String tenSinhVien;

    @JsonBackReference
    @OneToMany(mappedBy = "sinhVien", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<SinhVienKhoa> dsSinhVienKhoa;

}
