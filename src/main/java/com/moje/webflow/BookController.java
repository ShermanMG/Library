package com.moje.webflow;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Component;


@Component
public class BookController {
	
	private List<Book> bookList;
	
	public void fillList(){
		bookList= new ArrayList<Book>();
		Book book = new Book();
		book.setId(1);
		book.setPrice(2.3);
		book.setTitle("elo");
		bookList.add(book);
		
		book= new Book();
		book.setId(2);
		book.setPrice(2.3333);
		book.setTitle("el2222o");
		bookList.add(book);
		System.out.println("filling");
		
		book= new Book();
		book.setId(3);
		book.setPrice(2.111111111);
		book.setTitle("sssaaaaaaaaaaeeeeeee");
		bookList.add(book);
		System.out.println("filling");
		
		book= new Book();
		book.setId(4);
		book.setPrice(2.22222222);
		book.setTitle("sssssso");
		bookList.add(book);
		System.out.println("filling");
		
		
	}
	public void remove(){
		System.out.println("elo");
		bookList.remove(1);
		for(Book book:bookList){
			System.out.println(book.getId() + " " + book.getTitle()+ " " + book.getPrice());
		}
	}
	public BookController(){
		fillList();
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	
}
