package fr.htc.library.services.book;

import fr.htc.library.dao.book.BookDao;
import fr.htc.library.dao.book.BookDaoMapImpl;
import fr.htc.library.model.Book;

public class BookServiceImpl implements BookService {

	@Override
	public void create(String title, String author, int year) {
		//RG-APP-12
		if (title == null) {
			System.out.println("Can't create Book, title is mandatory");
			return;
		}

		//RG-APP-13
		Book book = new Book(title, author, year);
		if (book.getCote() == "" || book.getCote() == null) {
			System.out.println("Can't create Book, cote is mandatory");
			return;
		}
		
		BookDao bookDao = new BookDaoMapImpl();
		bookDao.save(book);
		System.out.println(book);

	}

}
