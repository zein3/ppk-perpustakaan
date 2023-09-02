package net.zeinhaddad.perpustakaan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import net.zeinhaddad.perpustakaan.dto.BookDto;
import net.zeinhaddad.perpustakaan.service.BookService;
import net.zeinhaddad.perpustakaan.soap.Book;
import net.zeinhaddad.perpustakaan.soap.CreateBookRequest;
import net.zeinhaddad.perpustakaan.soap.CreateBookResponse;
import net.zeinhaddad.perpustakaan.soap.GetBooksResponse;

@Endpoint
public class BookEndpoint {
    private static final String NAMESPACE_URI = "http://zeinhaddad.net/perpustakaan/soap";

    @Autowired
    private BookService bookService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createBookRequest")
    @ResponsePayload
    public CreateBookResponse createBook(@RequestPayload CreateBookRequest request) {
        BookDto book = BookDto.builder()
            .title(request.getBook().getTitle())
            .author(request.getBook().getAuthor())
            .description(request.getBook().getDescription())
            .build();
        bookService.createBook(book);

        CreateBookResponse response = new CreateBookResponse();
        response.setStatusCode(201);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBooksRequest")
    @ResponsePayload
    public GetBooksResponse getBooks() {
        GetBooksResponse response = new GetBooksResponse();

        List<BookDto> books = bookService.getBooks();
        for (BookDto book : books) {
            Book it = new Book();
            it.setTitle(book.getTitle());
            it.setAuthor(book.getAuthor());
            it.setDescription(book.getDescription());
            
            response.getBooks().add(it);
        }

        return response;
    }
}
