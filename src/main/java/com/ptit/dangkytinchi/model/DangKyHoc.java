package com.ptit.dangkytinchi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_dang_ky_hoc", schema = "dangkytinchi")
public class DangKyHoc {
    @Id
    @Column(name="madangkyhoc")
    private String maDangKyHoc;

    @ManyToOne
    @JoinColumn(name = "masinhvienkhoa", nullable = false)
    private SinhVienKhoa sinhVienKhoa;
}
