package fr.htc.library.dao.book;

import fr.htc.library.model.Book;
import fr.htc.library.util.MapDataBases;

public class BookDaoMapImpl implements BookDao {

	@Override
	public void save(Book book) {
		MapDataBases.getBooksMap().put(book.getCote(), book);
	}

	@Override
	public Book findByCote(String cote) {
		return MapDataBases.getBooksMap().get(cote);
	}

}
