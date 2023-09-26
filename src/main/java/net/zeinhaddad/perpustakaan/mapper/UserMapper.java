package net.zeinhaddad.perpustakaan.mapper;

import net.zeinhaddad.perpustakaan.dto.UserDto;
import net.zeinhaddad.perpustakaan.entity.User;

public class UserMapper {
    public static User mapToUser(UserDto userDto) {
        return User.builder()
            .id(userDto.getId())
            .name(userDto.getName())
            .email(userDto.getEmail())
            .password(userDto.getPassword())
            .build();
    }

    public static UserDto mapToDto(User user) {
        return UserDto.builder()
            .id(user.getId())
            .name(user.getName())
            .email(user.getEmail())
            .password(user.getPassword())
            .build();
    }
}
