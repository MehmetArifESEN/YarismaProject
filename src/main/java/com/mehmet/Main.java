package com.mehmet;

import com.mehmet.controller.UserController;
import com.mehmet.controller.YarismaController;
import com.mehmet.controller.YarismaKatilimController;
import com.mehmet.entity.User;
import com.mehmet.entity.Yarisma;
import com.mehmet.entity.YarismaKatilim;
import com.mehmet.service.UserService;
import com.mehmet.service.YarismaService;
import com.mehmet.utility.HibernateUtility;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

public class Main {

    private static org.hibernate.Transaction transaction;
    private static Session session;
    private static EntityManager entityManager;
    private static CriteriaBuilder criteriabuilder;
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Ahmet", "Ali" ,25,"Ankara");
        User user2 = new User("mehmet", "esen" ,26,"İstanbul");
        User user3 = new User("selami", "veli" ,23,"İzmir");
        User user4 = new User("zeynep", "kal" ,28,"İzmir");
        User user5 = new User("Ali", "Hasan" ,23,"Ankara");

        userService.save(user);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        YarismaService yarismaService = new YarismaService();
        Yarisma yarisma = new Yarisma(new Date(),new Date(),10,"Telefon" ,user2);
        yarismaService.save(yarisma);
        Yarisma yarisma2= new Yarisma(new Date(),new Date(),8,"Araba" ,user3);
        yarismaService.save(yarisma2);
        YarismaKatilim yarismaKatilim = new YarismaKatilim(yarisma,user,new Date());
        YarismaKatilim yarismaKatilim2 = new YarismaKatilim(yarisma,user3,new Date());
        YarismaKatilim yarismaKatilim3 = new YarismaKatilim(yarisma2,user,new Date());
        YarismaKatilim yarismaKatilim4 = new YarismaKatilim(yarisma2,user2,new Date());
        YarismaKatilim yarismaKatilim5 = new YarismaKatilim(yarisma2,user4,new Date());
        YarismaKatilim yarismaKatilim6 = new YarismaKatilim(yarisma2,user5,new Date());
        YarismaKatilim yarismaKatilim7 = new YarismaKatilim(yarisma,user5,new Date());

        YarismaKatilimController yarismaKatilimController = new YarismaKatilimController();
        yarismaKatilimController.yarismaciEkle(yarismaKatilim);
        yarismaKatilimController.yarismaciEkle(yarismaKatilim2);
        yarismaKatilimController.yarismaciEkle(yarismaKatilim3);
        yarismaKatilimController.yarismaciEkle(yarismaKatilim4);
        yarismaKatilimController.yarismaciEkle(yarismaKatilim5);
        yarismaKatilimController.yarismaciEkle(yarismaKatilim6);
        yarismaKatilimController.yarismaciEkle(yarismaKatilim7);



    }

    public static void yarismayaKatilanlar() {
        String sql ="SELECT * From tbl_user join yarismakatilim on yarismakatilim.user_id = tbl_user.id;";
        session = HibernateUtility.getSessionFactory().openSession();
        TypedQuery<Long> query = session.createQuery(sql, Long.class);
        List<Long> resultList = query.getResultList();
        resultList.forEach(System.out::println);

    }


}