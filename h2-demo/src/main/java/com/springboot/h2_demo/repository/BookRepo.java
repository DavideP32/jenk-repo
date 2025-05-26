package com.springboot.h2_demo.repository;

import com.springboot.h2_demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
}
