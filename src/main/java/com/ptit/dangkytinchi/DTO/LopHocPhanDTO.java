package com.ptit.dangkytinchi.DTO;

import com.ptit.dangkytinchi.model.LichHoc;
import com.ptit.dangkytinchi.model.MonHocKiHoc;
import lombok.Data;

import java.util.ArrayList;

@Data
public class LopHocPhanDTO {
    private String maLopHocPhan;
    private String tenLopHocPhan;
    private int siSoToiDa;
    private int siSoThucTe;
    private String moTa;
    private MonHocKiHoc monHocKiHoc;
    ArrayList<LichHoc> dsLichHoc;
}
