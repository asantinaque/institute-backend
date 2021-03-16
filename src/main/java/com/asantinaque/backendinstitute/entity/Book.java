package com.asantinaque.backendinstitute.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String bookTitle;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "edition")
    private String edition;

    @Column(name = "description")
    private String bookDescription;

   @JsonManagedReference(value = "group-filter")
    @ManyToMany(fetch = FetchType.LAZY, cascade =
            {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;

    public void addAuthor(Author author) {
        if (this.authors == null) {
            this.authors = new ArrayList<>();
        }
        this.authors.add(author);
    }
    public Book(){
    }

}
