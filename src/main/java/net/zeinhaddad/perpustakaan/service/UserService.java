package net.zeinhaddad.perpustakaan.service;

import net.zeinhaddad.perpustakaan.dto.UserDto;

public interface UserService {
    public UserDto createUser(UserDto user);
    public UserDto getUserByEmail(String email);
}
