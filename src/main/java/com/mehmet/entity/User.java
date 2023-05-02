package com.mehmet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    String surname;
    int age;

    String adres;

    public User(String name, String surname, int age, String adres) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adres = adres;
    }

    @OneToMany(mappedBy = "olusturan")
    private static List <Yarisma> olusturduguYarismalar;


    @OneToMany(mappedBy = "user")
    private List<YarismaKatilim> katildigiYarismalar;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", adres='" + adres + '\'' +
                ", katildigiYarismalar=" + katildigiYarismalar +
                '}';
    }
}
