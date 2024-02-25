package com.sheryians.major.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)//A category can have many product that is why many to one is used
    @JoinColumn(name = "category_id",referencedColumnName = "category_id")
    private Category category;

    private double price;

    private double weight;
    private String description;
    private String imageName;
}
