package com.ptit.dangkytinchi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_lich_hoc", schema = "dangkytinchi")
public class LichHoc {

    @Id
    @Column(name="malichhoc")
    private String maLichHoc;

    @Column(name="tenlichhoc")
    private String tenLichHoc;

    @Column(name="giangvien")
    private String giangvien;

    @ManyToOne
    @JoinColumn(name = "malophocphan", nullable = false)
    private LopHocPhan lopHocPhan;

    @ManyToOne
    @JoinColumn(name = "maphonghoc", nullable = false)
    private PhongHoc phongHoc;

    @ManyToOne
    @JoinColumn(name = "matuanhoc", nullable = false)
    private TuanHoc tuanHoc;

    @ManyToOne
    @JoinColumn(name = "mangayhoc", nullable = false)
    private NgayHoc ngayHoc;

    @ManyToOne
    @JoinColumn(name = "makiphoc", nullable = false)
    private KipHoc kipHoc;

}
