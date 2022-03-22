package com.ptit.dangkytinchi.DTO;

import com.ptit.dangkytinchi.model.BoMon;
import com.ptit.dangkytinchi.model.MonHocKiHoc;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Data
public class MonHocDTO {
    private String maMonHoc;
    private String tenMonHoc;
    private int soTc;
    private BoMon boMon;
    ArrayList<MonHocKiHoc> dsMonHocKiHoc;
}
