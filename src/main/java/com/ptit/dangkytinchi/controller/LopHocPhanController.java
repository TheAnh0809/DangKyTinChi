package com.ptit.dangkytinchi.controller;


import com.ptit.dangkytinchi.DTO.MonHocDTO;
import com.ptit.dangkytinchi.DTO.SinhVienDTO;
import com.ptit.dangkytinchi.exception.ResponeAPI;
import com.ptit.dangkytinchi.repository.LopHocPhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/dangkymonhoc", produces = "application/json")
@CrossOrigin(origins = "*")
public class LopHocPhanController {

    @Autowired
    private LopHocPhanRepository lopHocPhanRepository;

    public LopHocPhanController(LopHocPhanRepository lopHocPhanRepository) {
        this.lopHocPhanRepository = lopHocPhanRepository;
    }

    @PostMapping("/lophocphan")
    private ResponeAPI getLopHocPhanByMonHoc(@RequestBody MonHocDTO monHocDTO){
        ResponeAPI res = new ResponeAPI();


        return res;
    }

    @PostMapping("/")
    private ResponeAPI getMonHoc(@RequestBody SinhVienDTO sinhVienDTO){
        ResponeAPI res = new ResponeAPI();


        return res;
    }


}
