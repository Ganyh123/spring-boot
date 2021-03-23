package com.gyhstudy.springboot.jpa.repository;


import com.gyhstudy.springboot.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
