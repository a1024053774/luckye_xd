package com.luckye.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private Integer id;
    private String title;
    private String subTitle;
    private String info;
}