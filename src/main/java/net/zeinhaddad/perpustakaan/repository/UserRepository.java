package net.zeinhaddad.perpustakaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.zeinhaddad.perpustakaan.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
