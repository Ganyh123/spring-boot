package com.gyhstudy.springboot.jpa.entity;

import lombok.*;

import javax.persistence.*;


/**
 * @date 2021/3/18
 * @description Book
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "t_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String  name;
    private String cover;
}
