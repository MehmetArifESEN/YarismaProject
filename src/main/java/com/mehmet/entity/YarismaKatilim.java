package com.mehmet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class YarismaKatilim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "yarisma_id" , referencedColumnName = "id")
    private Yarisma yarisma;

    @ManyToOne
    @JoinColumn(name= "user_id" , referencedColumnName = "id")
    private User user;
    @Temporal(TemporalType.DATE)
    private Date katilimTarihi;

    public YarismaKatilim(Yarisma yarisma, User user, Date katilimTarihi) {
        this.yarisma = yarisma;
        this.user = user;
        this.katilimTarihi = katilimTarihi;
    }

    @Override
    public String toString() {
        return "YarismaKatilim{" +
                "id=" + id +
                ", yarisma=" + yarisma +
                ", user=" + user +
                ", katilimTarihi=" + katilimTarihi +
                '}';
    }
}
