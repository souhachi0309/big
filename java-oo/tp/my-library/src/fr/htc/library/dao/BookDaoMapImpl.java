package fr.htc.library.dao;

import fr.htc.library.dao.map.MapDataBases;
import fr.htc.library.model.Book;

public class BookDaoMapImpl implements BookDao {

	@Override
	public void save(Book book) {
		MapDataBases.getBooksMap().put(book.getCote(), book);
	}

}
