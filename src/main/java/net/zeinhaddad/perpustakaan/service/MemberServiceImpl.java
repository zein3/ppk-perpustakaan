package net.zeinhaddad.perpustakaan.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.zeinhaddad.perpustakaan.dto.MemberDto;
import net.zeinhaddad.perpustakaan.entity.Member;
import net.zeinhaddad.perpustakaan.mapper.MemberMapper;
import net.zeinhaddad.perpustakaan.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public MemberDto createMemeber(MemberDto memberDto) {
        Member member = memberRepository.save(MemberMapper.mapToMember(memberDto));
        return MemberMapper.mapToDto(member);
    }

    @Override
    public MemberDto updateMember(MemberDto memberDto) {
        Member member = memberRepository.save(MemberMapper.mapToMember(memberDto));
        return MemberMapper.mapToDto(member);
    }

    @Override
    public void deleteMember(MemberDto memberDto) {
        memberRepository.delete(MemberMapper.mapToMember(memberDto));
    }

    @Override
    public List<MemberDto> getMembers() {
        List<Member> members = memberRepository.findAll();
        List<MemberDto> memberDtos = members.stream()
            .map((member) -> (MemberMapper.mapToDto(member)))
            .collect(Collectors.toList());

        return memberDtos;
    }

    @Override
    public MemberDto getMember(Long id) {
        Member member = memberRepository.getReferenceById(id);
        return MemberMapper.mapToDto(member);
    }
    
}
