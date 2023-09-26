package net.zeinhaddad.perpustakaan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import net.zeinhaddad.perpustakaan.dto.UserDto;
import net.zeinhaddad.perpustakaan.entity.User;
import net.zeinhaddad.perpustakaan.mapper.UserMapper;
import net.zeinhaddad.perpustakaan.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto createUser(UserDto user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User newUser = userRepository.save(UserMapper.mapToUser(user));
        return UserMapper.mapToDto(newUser);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return UserMapper.mapToDto(user);
    }

}
