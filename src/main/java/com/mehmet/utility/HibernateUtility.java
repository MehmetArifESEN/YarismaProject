package com.mehmet.utility;


import com.mehmet.entity.User;
import com.mehmet.entity.Yarisma;
import com.mehmet.entity.YarismaKatilim;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();
    private static SessionFactory sessionFactoryHibernate() {
        try {
            Configuration configuration = new Configuration();

            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Yarisma.class);
            configuration.addAnnotatedClass(YarismaKatilim.class);

            SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
            return factory;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
