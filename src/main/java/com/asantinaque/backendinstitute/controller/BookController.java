package com.asantinaque.backendinstitute.controller;

import com.asantinaque.backendinstitute.dao.BookRepository;
import com.asantinaque.backendinstitute.entity.Author;
import com.asantinaque.backendinstitute.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewBook(@RequestParam String title,
                      @RequestParam String isbn,
                      @RequestParam String edition,
                      @RequestParam String description,
                      @RequestParam String authorName) {

        Book n = new Book();

        n.setBookTitle(title);
        n.setEdition(edition);
        n.setISBN(isbn);
        n.setBookDescription(description);
        n.addAuthor(new Author(authorName));
        bookRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/allBooks")
    public @ResponseBody Iterable<Book> getAllBooks() {
        // This returns a JSON or XML with the users
        return bookRepository.findAll();
    }
}
