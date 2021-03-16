package com.asantinaque.backendinstitute.dao;

import com.asantinaque.backendinstitute.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
