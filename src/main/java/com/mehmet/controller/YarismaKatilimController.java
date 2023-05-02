package com.mehmet.controller;

import com.mehmet.entity.Yarisma;
import com.mehmet.entity.YarismaKatilim;
import com.mehmet.repository.YarismaKatilimRepository;
import com.mehmet.service.YarismaKatilimService;
import com.mehmet.service.YarismaService;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;

import java.util.List;

public class YarismaKatilimController {

    private YarismaKatilimService yarismaKatilimService;

    public YarismaKatilimController() {
        this.yarismaKatilimService = new YarismaKatilimService();
    }
    public void yarismaciEkle(YarismaKatilim yarismaKatilim) {
        //int katilimciSayi= yarismaKatilimService.findRows(yarismaKatilim);

       // if (katilimciSayi<yarismaKatilim.getYarisma().getKatilim()) {
            yarismaKatilimService.save(yarismaKatilim);
        //}else {
        //    System.out.println("Yarışmacı kontenjanı dolmuştur");
        //}
    }




}
