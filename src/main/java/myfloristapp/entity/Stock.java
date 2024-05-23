package myfloristapp.entity;


import jakarta.persistence.*;
import myfloristapp.entity.Florist;

@Entity
@Table(name = "STOCK")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSTOCK;

    @ManyToOne
    @JoinColumn(name = "idFLORIST", nullable = false)
    private Florist florist;

    public int getIdSTOCK() {
        return idSTOCK;
    }

    public void setIdSTOCK(int idSTOCK) {
        this.idSTOCK = idSTOCK;
    }

    public Florist getFlorist() {
        return florist;
    }

    public void setFlorist(Florist florist) {
        this.florist = florist;
    }

}