package com.ptit.dangkytinchi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_khoa", schema = "dangkytinchi")
public class Khoa {

    @Id
    @Column(name="makhoa")
    private String maKhoa;

    @Column(name="tenkhoa")
    private String tenKhoa;

    @Column(name="mota")
    private String moTa;

    @OneToMany(mappedBy = "khoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<BoMon> dsBoMon;

    @OneToMany(mappedBy = "khoa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<SinhVienKhoa> dsSinhVienKhoa;

}
