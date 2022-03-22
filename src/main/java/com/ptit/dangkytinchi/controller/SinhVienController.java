package com.ptit.dangkytinchi.controller;

import com.ptit.dangkytinchi.DTO.DangNhapDTO;
import com.ptit.dangkytinchi.model.SinhVien;
import com.ptit.dangkytinchi.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/sinhvien", produces = "application/json")
@CrossOrigin(origins = "*")
public class SinhVienController {
    private SinhVienRepository svRepo;

    @Autowired
    public SinhVienController(SinhVienRepository svRepo) {
        this.svRepo = svRepo;
    }

    @GetMapping("/danhsach")
    public List<SinhVien> danhSachTaiKhoan() {
        return svRepo.findAll();
    }
    @PostMapping("/dangnhap")
    public boolean dangNhap(@RequestBody DangNhapDTO dangNhapDTO){
        System.out.println(dangNhapDTO.getTaiKhoan());
        SinhVien sv = svRepo.findOneByTaiKhoanAndMatKhau(dangNhapDTO.getTaiKhoan(), dangNhapDTO.getMatKhau());
        System.out.println(sv.getTaiKhoan());
        if(sv == null) return false;
        else  return  true;
    }
}
