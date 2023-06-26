package org.tnsif.dao;
import java.util.List;
import org.tnsif.entities.Book;

public interface BookDao {
	
	Book getBookByID(int id); //single entity
	List<Book>getAllBooks(); //all the books
	Long getBookCount(); //Count
	List<Book>getAuthorBooks(String author); //Particular author
	List<Book>getBookByTitle(String title); //for particular title
	List<Book>getBookByPrice(double low,double high); //price range
}
