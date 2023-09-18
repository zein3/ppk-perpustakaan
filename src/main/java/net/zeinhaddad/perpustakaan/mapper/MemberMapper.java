package net.zeinhaddad.perpustakaan.mapper;

import net.zeinhaddad.perpustakaan.dto.MemberDto;
import net.zeinhaddad.perpustakaan.entity.Member;

public class MemberMapper {
    public static Member mapToMember(MemberDto dto) {
        return Member.builder()
            .id(dto.getId())
            .memberID(dto.getMemberID())
            .name(dto.getName())
            .address(dto.getAddress())
            .phoneNumber(dto.getPhoneNumber())
            .build();
    }

    public static MemberDto mapToDto(Member member) {
        return MemberDto.builder()
            .id(member.getId())
            .memberID(member.getMemberID())
            .name(member.getName())
            .address(member.getAddress())
            .phoneNumber(member.getPhoneNumber())
            .build();
    }
}
