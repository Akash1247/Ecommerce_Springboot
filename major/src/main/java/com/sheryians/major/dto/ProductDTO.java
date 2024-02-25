package com.sheryians.major.dto;

import com.sheryians.major.model.Category;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProductDTO {
//I cant understand why does have we made this file??

    private Long id;

    private String name;

    private int categoryId;

    private double price;

    private double weight;
    private String description;
    private String imageName;
}
