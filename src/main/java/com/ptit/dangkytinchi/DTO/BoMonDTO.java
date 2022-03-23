package com.ptit.dangkytinchi.DTO;

import com.ptit.dangkytinchi.model.Khoa;
import com.ptit.dangkytinchi.model.MonHoc;
import lombok.Data;
import java.util.Set;
@Data
public class BoMonDTO {
    private String maBoMon;

    private String tenBoMon;

    private String moTa;

    Set<MonHoc> dsMonHoc;

    private Khoa khoa;
}
