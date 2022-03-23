package com.ptit.dangkytinchi.controller;

import com.ptit.dangkytinchi.model.BoMon;
import com.ptit.dangkytinchi.repository.BoMonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/bomon", produces = "application/json")
@CrossOrigin(origins = "*")
public class BoMonController {
    private BoMonRepository boMonRepository;

    @Autowired
    public BoMonController() {
        this.boMonRepository = boMonRepository;
    }

    @GetMapping("/")
    public List<BoMon> danhSachBoMon() {
        return boMonRepository.findAll();
    }


    public List<BoMon> danhSachBoMon(String maKhoa){
        ArrayList<BoMon> list = (ArrayList<BoMon>) boMonRepository.findAll();
        ArrayList<BoMon> listrepo = null;
        list.forEach(boMon -> {
            if(boMon.getKhoa().getMaKhoa().equals(maKhoa)){
                listrepo.add(boMon);
            }
        });
        return  listrepo;
    }
}
