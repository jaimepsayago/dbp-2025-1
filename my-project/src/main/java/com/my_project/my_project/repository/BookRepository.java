package com.my_project.my_project.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.my_project.my_project.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	//agregar mas operaciones personalizadas
	Optional<Book> findBookByTitle(String title);
	Optional<Book> deleteBookByTitle(String title);


}
