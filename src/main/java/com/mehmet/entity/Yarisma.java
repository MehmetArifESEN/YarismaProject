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
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date baslangic;
    @Temporal(TemporalType.DATE)
    private Date bitis;

    private int katilim;

    private String ödül;


    @ManyToOne
    @JoinColumn(name= "olusturan_id" , referencedColumnName = "id")
    private User olusturan;

    public Yarisma(User olusturan) {
        this.olusturan= olusturan;
    }

    public Yarisma(Date baslangic, Date bitis, int katilim, String ödül, User olusturan) {
        this.baslangic = baslangic;
        this.bitis = bitis;
        this.katilim = katilim;
        this.ödül = ödül;
        this.olusturan = olusturan;
    }

    @Override
    public String toString() {
        return "Yarisma{" +
                "id=" + id +
                ", baslangic=" + baslangic +
                ", bitis=" + bitis +
                ", katilim=" + katilim +
                ", ödül='" + ödül + '\'' +
                ", olusturan=" + olusturan +
                '}';
    }
}
