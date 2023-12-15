package com.example.entity;

import lombok.Data;

/**
 * @create: xx
 * @time: 2023-11-18
 */
@Data
public class BaseFruitInfo extends BaseInfo {
    private int id;
    private String fruitName;
    private String fruitNameEnglish;
    private String category;
    private Integer export;
    private String country;
    private String city;
    private String taste;
    private String describe;
    private Integer storageCondition;
    private String anotherName;
    private String nutrition;
    private String familiesGenera;
}
