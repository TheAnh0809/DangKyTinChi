package com.ptit.dangkytinchi.controller;


import com.ptit.dangkytinchi.model.SinhVien;
import com.ptit.dangkytinchi.model.SinhVienKhoa;
import com.ptit.dangkytinchi.repository.SinhVienKhoaRepository;
import com.ptit.dangkytinchi.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/sinhvienkhoa", produces = "application/json")
@CrossOrigin(origins = "*")
public class SinhVienKhoaController {
    @Autowired
    private SinhVienKhoaRepository sinhVienKhoaRepository;

    public SinhVienKhoaController(SinhVienKhoaRepository sinhVienKhoaRepository) {
        this.sinhVienKhoaRepository = sinhVienKhoaRepository;
    }

    @GetMapping("/danhsach")
    public List<SinhVienKhoa> getSVK(){
         List<SinhVienKhoa> res = new ArrayList<SinhVienKhoa>();
         res = sinhVienKhoaRepository.findAll();
        return res;
    }

    @GetMapping("/danhsach/B18DCCN147")
    public SinhVienKhoa getExactSVK(){
//        List<SinhVienKhoa> res = new ArrayList<SinhVienKhoa>();
//        res = sinhVienKhoaRepository.findAll();
        return sinhVienKhoaRepository.findSinhVienKhoaBySinhVien_MaSinhVien("B18DCCN147");
    }

}
