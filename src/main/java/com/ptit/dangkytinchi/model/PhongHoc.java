package com.ptit.dangkytinchi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_phong_hoc", schema = "dangkytinchi")
public class PhongHoc {

    @Id
    @Column(name = "maphonghoc")
    private String maPhongHoc;

    @Column(name="tenphonghoc")
    private String tenPhongHoc;

    @Column(name="succhua")
    private int sucChua;

    @ManyToOne
    @JoinColumn(name = "matoanha", nullable = false)
    private ToaNha toaNha;

    @OneToMany(mappedBy = "phongHoc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<LichHoc> dsLichHoc;
}
