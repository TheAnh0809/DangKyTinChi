package com.ptit.dangkytinchi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_mon_hoc_ki_hoc", schema = "dangkytinchi")
public class MonHocKiHoc {

    @Id
    @Column(name = "mamonhockihoc")
    private String maMocHocKiHoc;

    @ManyToOne
    @JoinColumn(name = "mamonhoc", nullable = false)
    private MonHoc monHoc;

    @ManyToOne
    @JoinColumn(name = "makihoc", nullable = false)
    private KiHoc kiHoc;

    @OneToMany(mappedBy = "monHocKiHoc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<LopHocPhan> dsLopHocPhan;
}
