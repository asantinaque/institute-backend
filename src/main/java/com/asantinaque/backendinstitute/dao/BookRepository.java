package com.asantinaque.backendinstitute.dao;

import com.asantinaque.backendinstitute.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
}