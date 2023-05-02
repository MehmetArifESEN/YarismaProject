package com.mehmet.service;

import com.mehmet.entity.Yarisma;
import com.mehmet.entity.YarismaKatilim;
import com.mehmet.repository.YarismaRepository;
import com.mehmet.utility.MyFactoryService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class YarismaService extends MyFactoryService<YarismaRepository, Yarisma, Long> {
    public YarismaService() {
        super(new YarismaRepository());
    }


}
