package fr.htc.library.app;

import fr.htc.library.dao.map.MapDataBases;
import fr.htc.library.services.BookService;
import fr.htc.library.services.BookServiceImpl;
import fr.htc.library.services.MemberService;
import fr.htc.library.services.MemberServiceImpl;

public class MyLibraryApp {

	public static void main(String[] args) {
		// insert books
		BookService bookService = new BookServiceImpl();
		String title = "Ce que le jours doit à la nuit";
		String author = "Yasmina KHADRA";
		int year = 2000;
		
		bookService.create(title, author, year);
		bookService.create(title, author, year);
		bookService.create(title, author, year);
		bookService.create(title, author, year);
		bookService.create(title, author, year);
		bookService.create(title, author, year);
		System.out.println(MapDataBases.getBooksMap().keySet());
		
		//insert members
		MemberService memberService = new MemberServiceImpl();
		String firstName = "Djamel";
		String lastName = "MOUCHENE";
		int age = 25;
		memberService.create(firstName, lastName, age);
		
		//make usecases 

	}

}
