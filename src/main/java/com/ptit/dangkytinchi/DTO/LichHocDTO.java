package com.ptit.dangkytinchi.DTO;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ptit.dangkytinchi.model.*;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class LichHocDTO {
    private String maLichHoc;
    private String tenLichHoc;
    private String giangvien;
    private LopHocPhan lopHocPhan;
    private PhongHoc phongHoc;
    private TuanHoc tuanHoc;
    private NgayHoc ngayHoc;
    private KipHoc kipHoc;
}
