package com.asantinaque.backendinstitute.dao;

import com.asantinaque.backendinstitute.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
