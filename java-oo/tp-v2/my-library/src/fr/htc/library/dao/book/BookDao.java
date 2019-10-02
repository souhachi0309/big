package fr.htc.library.dao.book;

import fr.htc.library.model.Book;

public interface BookDao {

	public void save(Book book);

	public Book findByCote(String cote);

}
