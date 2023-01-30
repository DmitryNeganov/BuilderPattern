package org.intensive.builder;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "lunch")
public class Lunch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="salad")
    private String salad;
    @Column(name="soup")
    private String soup;
    @Column(name="main_dish")
    private String mainDish;
    @Column(name="beverage")
    private String beverage;
    @Column(name="desert")
    private String desert;

    @Override
    public String toString() {
        return "salad: " + salad +
                ", soup: " + soup +
                ", main dish: " + mainDish +
                ", beverage: " + beverage +
                ", desert: " + desert;
    }

}