package com.asantinaque.backendinstitute.controller;

import com.asantinaque.backendinstitute.dao.AuthorRepository;
import com.asantinaque.backendinstitute.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/author")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping(path = "/allAuthors")
    public @ResponseBody
    Iterable<Author> getAllAuthors() {
        // This returns a JSON or XML with the users
        return authorRepository.findAll();
    }
}
