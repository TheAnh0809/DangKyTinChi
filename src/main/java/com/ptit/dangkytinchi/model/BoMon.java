package com.ptit.dangkytinchi.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_bo_mon", schema = "dangkytinchi")
public class BoMon {

    @Id
    @Column(name="mabomon")
    private String maBoMon;

    @Column(name="tenbomon")
    private String tenBoMon;

    @Column(name="mota")
    private String moTa;

    @OneToMany(mappedBy = "boMon", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<MonHoc> dsMonHoc;

    @ManyToOne
    @JoinColumn(name = "makhoa", nullable = false)
    private Khoa khoa;
}
