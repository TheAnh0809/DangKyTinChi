package com.ptit.dangkytinchi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_sinh_vien_khoa", schema = "dangkytinchi")
public class SinhVienKhoa {

    @Id
    @Column(name = "masinhvienkhoa")
    private String maSinhVienKhoa;

    @Column(name = "nienkhoa")
    private  String nienKhoa;

    @Column(name = "danghoc")
    private boolean dangHoc;

    @ManyToOne
    @JoinColumn(name="makhoa", nullable = false)
    private Khoa khoa;

    @OneToMany(mappedBy = "sinhVienKhoa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<DangKyHoc> dsDangKyHoc;

    @ManyToOne
    @JoinColumn(name = "masinhvien", nullable = false)
    private SinhVien sinhVien;
}
