package com.mehmet.service;

import com.mehmet.entity.YarismaKatilim;
import com.mehmet.repository.YarismaKatilimRepository;
import com.mehmet.utility.MyFactoryService;

public class YarismaKatilimService extends MyFactoryService<YarismaKatilimRepository, YarismaKatilim, Long> {
    public YarismaKatilimService() {
        super(new YarismaKatilimRepository());
    }

    public int findRows(YarismaKatilim yarismaKatilim) {
        return findRows(yarismaKatilim);
    }
}
