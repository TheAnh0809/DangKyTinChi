package com.ptit.dangkytinchi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_mon_hoc", schema = "dangkytinchi")
public class MonHoc {
    @Id
    @Column(name="mamonhoc")
    private String maMonHoc;

    @Column(name = "tenmonhoc")
    private String tenMonHoc;

    @Column(name="sotc")
    private int soTc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="mabomon", nullable = false)
    private BoMon boMon;

    @OneToMany(mappedBy = "monHoc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<MonHocKiHoc> dsMonHocKiHoc;
}
