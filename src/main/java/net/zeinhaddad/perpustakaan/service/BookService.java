package net.zeinhaddad.perpustakaan.service;

import java.util.List;

import net.zeinhaddad.perpustakaan.dto.BookDto;

public interface BookService {
    public BookDto createBook(BookDto bookDto);
    public BookDto updateBook(BookDto bookDto);
    public void deleteBook(BookDto bookDto);
    public List<BookDto> getBooks();
    public BookDto getBook(Long id);
}
