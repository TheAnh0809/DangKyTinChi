package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_lop_hoc_phan", schema = "dangkytinchi")
public class LopHocPhan {

    @Id
    @Column(name="malophocphan")
    private String maLopHocPhan;

    @Column(name="tenlophocphan")
    private String tenLopHocPhan;

    @Column(name="sisotoida")
    private int siSoToiDa;

    @Column(name="sisothucte")
    private int siSoThucTe;

    @Column(name="mota")
    private String moTa;

    @ManyToOne
    @JoinColumn(name = "mamonhockihoc", nullable = false)
    private MonHocKiHoc monHocKiHoc;

    @OneToMany(mappedBy = "lopHocPhan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonBackReference
    List<LichHoc> dsLichHoc;
}
