package net.zeinhaddad.perpustakaan.service;

import java.util.List;

import net.zeinhaddad.perpustakaan.dto.MemberDto;

public interface MemberService {
    public MemberDto createMemeber(MemberDto memberDto);
    public MemberDto updateMember(MemberDto memberDto);
    public void deleteMember(MemberDto memberDto);
    public List<MemberDto> getMembers();
    public MemberDto getMember(Long id);
}
