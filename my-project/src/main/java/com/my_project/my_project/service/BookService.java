package com.my_project.my_project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_project.my_project.model.Book;
import com.my_project.my_project.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	//obtener todos los libros
	public Iterable<Book> getAllBooks(){
		Iterable<Book> books= bookRepository.findAll();
		return books;
	}
	
	//crear
	public Book createBook(Book book) {
		Book bookCreated = bookRepository.save(book);
		return bookCreated;
	}
	
	//buscar por Title
	public Optional<Book> findBookByTitle(String title){
		return bookRepository.findBookByTitle(title);
	}
	//buscar por Id
	public Optional<Book> findBookById(Long id){
		return bookRepository.findById(id);
	}
	
	//borrar por title
	public Book deleteBookByTitle(String title){
		Optional<Book> deleteBook= bookRepository.deleteBookByTitle(title);
		return null;
	}
	
	//acrtualizar
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	
	//borrar
	public void deleteBook(Book book) {
		bookRepository.delete(book);
	}
	

}
