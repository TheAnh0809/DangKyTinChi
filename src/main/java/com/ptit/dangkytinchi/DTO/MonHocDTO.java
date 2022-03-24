package com.ptit.dangkytinchi.DTO;

import com.ptit.dangkytinchi.model.BoMon;
import com.ptit.dangkytinchi.model.MonHocKiHoc;
import lombok.Data;

import java.util.ArrayList;

@Data
public class MonHocDTO {
    private String maMonHoc;
    private String tenMonHoc;
    private int soTc;
<<<<<<< HEAD
    private String maBoMon;

    public MonHocDTO(String maMonHoc, String tenMonHoc, int soTc, String maBoMon) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTc = soTc;
        this.maBoMon = maBoMon;
    }
=======
    private BoMonDTO boMon;
    ArrayList<MonHocKiHocDTO> dsMonHocKiHoc;
>>>>>>> f312af3180882b8cda7f2259d80fdc588a176a47
}
