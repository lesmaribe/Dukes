package za.co.lesetja.dukesservices.serv;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import za.co.lesetja.dukesapi.api.BookAPI;
import za.co.lesetja.dukesapi.dto.BookDTO;

public class BookIMP implements BookAPI{

	private static List<BookDTO> bookList = new ArrayList<>();
	private static BookDTO book;
	
	static{
		book = new BookDTO();
		book.setAuthorName("Lesetja");
		book.setAuthorSurname("Maribe");
		book.setAuthorTitle("Mr");
		book.setCopies(10);
		book.setDescription("How to program in java se 7 and java ee 7, using jee container jboss eap 6. for front end suit your self, use whatever you like.");
		book.setId(1000);
		book.setOnSale(true);
		book.setPrice(100.0);
		book.setTitle("How to Program");
		book.setYear(2017);
		bookList.add(book);
		
		book = new BookDTO();
		book.setAuthorName("Thebe");
		book.setAuthorSurname("Maribe");
		book.setAuthorTitle("Mr");
		book.setCopies(20);
		book.setDescription("How to program in Objective C and java ee 7, using jee container jboss eap 6. for front end suit your self, use whatever you like.");
		book.setId(2000);
		book.setOnSale(true);
		book.setPrice(2000.0);
		book.setTitle("How to program in C");
		book.setYear(2010);
		bookList.add(book);
	}
	
	public BookIMP() {
	}
	
	@Override
	public List<BookDTO> getBooks() {
		return bookList;
	}

	@Override
	public BookDTO getBook(int id) {
		for(BookDTO book: bookList){
			if(book.getId() == id)
				return book;
		}
		throw new WebApplicationException(Response.Status.NOT_FOUND);
		// return null;
	}

	@Override
	public BookDTO createBook(BookDTO book) {
		bookList.add(book);
		return book;
	}

	@Override
	public BookDTO updateBook(BookDTO book) {
		for(BookDTO b: bookList){
			if(b.getId() == book.getId()){
				bookList.remove(b);
				bookList.add(book);
				return book;
			}
		}
		throw new WebApplicationException(Response.Status.NOT_FOUND);
	}
}