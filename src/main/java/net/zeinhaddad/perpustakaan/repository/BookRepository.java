package net.zeinhaddad.perpustakaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.zeinhaddad.perpustakaan.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
