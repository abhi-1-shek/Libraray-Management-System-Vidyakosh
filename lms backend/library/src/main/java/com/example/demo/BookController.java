package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:5173") 
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() { 
        return bookRepository.findAll(); 
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) { 
        return bookRepository.save(book); 
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book details) {
        Book book = bookRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
        
        book.setTitle(details.getTitle());
        book.setAuthor(details.getAuthor());
        book.setIsbn(details.getIsbn());
        book.setPublishYear(details.getPublishYear()); 
        
        return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) { 
        bookRepository.deleteById(id); 
    }
}
