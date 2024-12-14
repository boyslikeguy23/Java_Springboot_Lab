package org.example.springboot_lab03.service;

import org.example.springboot_lab03.entity.Khoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KhoaService {
    List<Khoa> khoaList = new ArrayList<Khoa>();

    public KhoaService() {
        khoaList.addAll(Arrays.asList(
                new Khoa("AV","Anh văn"),
                new Khoa("TH","Tin học"),
                new Khoa("TR","Triết học")
        ));
    }

    // Get all
    public List<Khoa> getKhoaList() {
        return khoaList;
    }
    // Get By id
    public Khoa getKhoa(String makh) {
        return khoaList.stream().filter(k->k.getMaKH().equals(makh)).findFirst().orElse(null);
    }
}
