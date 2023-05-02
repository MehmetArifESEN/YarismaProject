package com.mehmet.repository;

import com.mehmet.entity.YarismaKatilim;
import com.mehmet.utility.MyFactoryRepository;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class YarismaKatilimRepository extends MyFactoryRepository<YarismaKatilim , Long> {
    public YarismaKatilimRepository() {
        super(new YarismaKatilim());
    }

    public int findRows(YarismaKatilim yarismaKatilim) {
        String sql = "SELECT  count(yarisma_id)\n" +
                "\tFROM public.yarismakatilim where yarisma_id = "+ yarismaKatilim.getYarisma().getId() +";";


        SQLQuery query = getSs().createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List results = query.list();


        return (int) results.get(0);
    }



}
