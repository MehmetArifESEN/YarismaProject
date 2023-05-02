package com.mehmet.repository;


import com.mehmet.entity.Yarisma;
import com.mehmet.utility.MyFactoryRepository;

public class YarismaRepository extends MyFactoryRepository<Yarisma, Long> {
    public YarismaRepository() {
        super(new Yarisma());
    }
}
