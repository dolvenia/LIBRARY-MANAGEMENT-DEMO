package com.EXAMPLE.LIBRARY.repo;


import com.EXAMPLE.LIBRARY.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
}
