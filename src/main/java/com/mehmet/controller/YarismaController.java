package com.mehmet.controller;

import com.mehmet.entity.User;
import com.mehmet.entity.Yarisma;
import com.mehmet.service.YarismaService;

import java.util.List;

public class YarismaController {



    private YarismaService yarismaService;
     public YarismaController() {
         this.yarismaService = new YarismaService();
     }
     public void yeniYarisma(Yarisma yarisma) {
         yarismaService.save(yarisma);

     }

}
