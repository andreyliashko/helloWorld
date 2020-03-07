package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    private  BookService bookService;

    @RequestMapping(value = "/books-list", method = RequestMethod.GET)
    public String booksList(Model mode) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("my first book", "1234523523"));
        mode.addAttribute("books", books);
        return "index";
    }
    @RequestMapping(value = "/add-book", method = RequestMethod.POST)
    public String addNewBook(
          @ModelAttribute BookModel modelAtr
    ) {
        bookService.add(modelAtr);
        return "redirect:/books-list";
    }
    }


