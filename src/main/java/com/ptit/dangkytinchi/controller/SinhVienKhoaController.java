package com.ptit.dangkytinchi.controller;

import com.ptit.dangkytinchi.DTO.SinhVienDTO;
import com.ptit.dangkytinchi.exception.ResponeAPI;
import com.ptit.dangkytinchi.model.BoMon;
import com.ptit.dangkytinchi.model.SinhVien;
import com.ptit.dangkytinchi.model.SinhVienKhoa;
import com.ptit.dangkytinchi.repository.BoMonRepository;
import com.ptit.dangkytinchi.repository.SinhVienKhoaRepository;
import com.ptit.dangkytinchi.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/sinhvienkhoa", produces = "application/json")
@CrossOrigin(origins = "*")
public class SinhVienKhoaController {
    private SinhVienKhoaRepository svRepo;
    private BoMonRepository boMonRepository;
    @Autowired
    public SinhVienKhoaController(SinhVienKhoaRepository svRepo) {
        this.svRepo = svRepo;
    }

    @GetMapping("/danhsach")
    public List<SinhVienKhoa> danhSachSinhVienKhoa() {
        return svRepo.findAll();
    }
    @PostMapping("/khoa")
    public ResponeAPI layKhoaTheoMaSinhVien(@RequestBody SinhVienDTO sinhVienDTO){
        ResponeAPI res = new ResponeAPI();
        ArrayList<SinhVienKhoa>  list = (ArrayList<SinhVienKhoa>) svRepo.findAll();
        for (SinhVienKhoa svk : list) {
            if (svk.getSinhVien().getMaSinhVien().equals(sinhVienDTO.getMaSinhVien())) {
                return res;
            }
        }
        res.setError("Mã sinh viên sai");
        return res;
    }
}
